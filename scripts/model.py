import os
from pyspark.sql import SparkSession
from pyspark.sql.functions import to_date, year, month, dayofmonth, sin, cos, pi
from pyspark.ml import Transformer, Pipeline
from pyspark.ml.param.shared import HasInputCol, HasOutputCols
from pyspark.ml.feature import StringIndexer, OneHotEncoder, VectorAssembler, Word2Vec, RegexTokenizer, VectorIndexer
from pyspark.ml.regression import LinearRegression
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.ml.tuning import ParamGridBuilder, CrossValidator
import numpy as np
from pyspark.sql import functions as F
from pyspark.sql import Row


class CyclicDateEncoder(Transformer, HasInputCol, HasOutputCols):
    """Transformer to encode date features cyclically using sine
    and cosine transformations."""

    def __init__(self, inputCol=None, outputCols=None):
        super(CyclicDateEncoder, self).__init__()
        self._set(inputCol=inputCol, outputCols=outputCols)

    def _transform(self, df):
        input_col = self.getInputCol()
        output_cols = self.getOutputCols()
        if input_col == "month":
            return df.withColumn(
                output_cols[0],
                sin(2 * pi() * F.col(input_col) / 12)
            ).withColumn(
                output_cols[1],
                cos(2 * pi() * F.col(input_col) / 12)
            )
        elif input_col == "day":
            return df.withColumn(
                output_cols[0],
                sin(2 * pi() * F.col(input_col) / 31)
            ).withColumn(
                output_cols[1],
                cos(2 * pi() * F.col(input_col) / 31)
            )


def run(command):
    """Function to put data from hdfs"""
    return os.popen(command).read()


def main():
    # Add here your team number teamx
    team = 19

    # location of your Hive database in HDFS
    # warehouse = "project/hive/warehouse"
    warehouse = "/user/team19/project/warehouse"

    spark = SparkSession.builder\
        .appName("{} - spark ML".format(team))\
        .master("yarn")\
        .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883")\
        .config("spark.sql.warehouse.dir", warehouse)\
        .config("spark.sql.avro.compression.codec", "snappy")\
        .enableHiveSupport()\
        .getOrCreate()
    spark.sql("USE team19_projectdb").show()
    hosts_bucketed = spark.read.format("avro").table('team19_projectdb.hosts_bucketed')
    listings_partitioned = spark.read.format("avro").table('team19_projectdb.listings_partitioned')
    review_scores_bucketed = spark.read.format("avro").table('team19_projectdb.review_scores_bucketed')
    result_df = (
        listings_partitioned
        .join(
            hosts_bucketed,
            on="host_id",
            how="left"
        )
        .join(
            review_scores_bucketed,
            on=F.col("id") == F.col("listing_id"),
            how="left"
        )
    )
    features = ['last_scraped', 'street', 'property_type', 'room_type',
                'accommodates', 'bathrooms', 'bedrooms', 'beds',
                'number_of_reviews', 'reviews_per_month', 'city', 'country',
                'host_since', 'host_location', 'host_response_time',
                'host_response_rate', 'host_listings_count',
                'host_total_listings_count',
                'host_verifications', 'review_scores_rating',
                'review_scores_accuracy', 'review_scores_cleanliness',
                'review_scores_checkin', 'review_scores_communication',
                'review_scores_location', 'review_scores_value']
    label = 'price'
    result_df = result_df.select(features + [label]).na.drop()
    result_df = result_df.withColumnRenamed("price", "label")
    df_with_dates = result_df.withColumn(
        "date_parsed",
        to_date("last_scraped", format="yyyy-MM-dd")
    ).withColumn(
        "last_scraped_year", year("date_parsed")
    ).withColumn(
        "month", month("date_parsed")
    ).withColumn(
        "day", dayofmonth("date_parsed")
    )
    month_encoder = CyclicDateEncoder(
        inputCol="month",
        outputCols=["last_scrapped_month_sin", "last_scrapped_month_cos"]
    )
    day_encoder = CyclicDateEncoder(
        inputCol="day",
        outputCols=["last_scrapped_day_sin", "last_scrapped_day_cos"]
    )
    df_encoded = month_encoder.transform(df_with_dates)
    df_encoded = day_encoder.transform(df_encoded)
    df_encoded = df_encoded.drop("last_scraped", "date_parsed", "day", "month")

    df_with_dates = df_encoded.withColumn(
        "date_parsed",
        to_date("host_since", format="yyyy-MM-dd")
    ).withColumn(
        "year_host_since", year("date_parsed")
    ).withColumn(
        "month", month("date_parsed")
    ).withColumn(
        "day", dayofmonth("date_parsed")
    )
    month_encoder = CyclicDateEncoder(
        inputCol="month",
        outputCols=["host_since_month_sin", "host_since_month_cos"]
    )
    day_encoder = CyclicDateEncoder(
        inputCol="day",
        outputCols=["host_since_day_sin", "host_since_day_cos"]
    )
    df_encoded = month_encoder.transform(df_with_dates)
    df_encoded = day_encoder.transform(df_encoded)
    df_encoded = df_encoded.drop("month", "day", "date_parsed", "host_since")
    df_encoded = df_encoded.drop("last_scraped")

    categoricalCols = ['city', 'country', 'host_location',
                       'host_verifications', 'property_type',
                       'room_type', 'host_response_time']
    others = ['accommodates', 'bathrooms', 'bedrooms', 'beds',
              'number_of_reviews', 'reviews_per_month',
              'host_response_rate', 'host_listings_count',
              'host_total_listings_count', 'review_scores_rating',
              'review_scores_accuracy', 'review_scores_cleanliness',
              'review_scores_checkin', 'review_scores_communication',
              'review_scores_location', 'review_scores_value',
              'last_scraped_year', 'host_since_month_sin',
              'host_since_month_cos', 'host_since_day_sin',
              'host_since_day_cos', 'year_host_since']

    tokenizer = RegexTokenizer(
        inputCol="street",
        outputCol="city_tokens",
        pattern=r"[,\s]+"
    )
    word2Vec = Word2Vec(
        vectorSize=10,
        minCount=1,
        windowSize=5,
        inputCol="city_tokens",
        outputCol="city_vec"
    )
    indexers = [StringIndexer(inputCol=c, outputCol="{0}_indexed".format(c)).setHandleInvalid("skip") for c in categoricalCols]
    encoders = [OneHotEncoder(inputCol=indexer.getOutputCol(), outputCol="{0}_encoded".format(indexer.getOutputCol())) for indexer in indexers]
    assembler = VectorAssembler(inputCols=[encoder.getOutputCol() for encoder in encoders] + others, outputCol= "features")
    pipeline = Pipeline(stages=[tokenizer, word2Vec] + indexers + encoders + [assembler])

    model = pipeline.fit(df_encoded)
    data = model.transform(df_encoded)

    # We delete all features and keep only the features and label columns
    data = data.select(["features", "label"])

    # Automatically identify categorical features, and index them.
    # We specify maxCategories so features with > 4
    # distinct values are treated as continuous.
    featureIndexer = VectorIndexer(inputCol="features",
                                   outputCol="indexedFeatures",
                                   maxCategories=4).fit(data)
    transformed = featureIndexer.transform(data)
    transformed = transformed.withColumn("label", F.col("label").cast("double"))
    #  split the data into 60% training and 40% test (it is not stratified)
    (train_data, test_data) = transformed.randomSplit([0.6, 0.4], seed=10)
    train_data.select("features", "label")\
        .coalesce(1)\
        .write\
        .mode("overwrite")\
        .format("json")\
        .save("project/data/train")

    # Run it from root directory of the repository
    run("hdfs dfs -cat project/data/train/*.json > ./data/train.json")

    test_data.select("features", "label")\
        .coalesce(1)\
        .write\
        .mode("overwrite")\
        .format("json")\
        .save("project/data/test")

    # Run it from root directory of the repository
    run("hdfs dfs -cat project/data/test/*.json > ./data/test.json")

    optimal_partitions = 12
    train_data = train_data.repartition(optimal_partitions)

    # Create Linear Regression Model
    lr = LinearRegression(maxIter=30)

    # Fit the data to the pipeline stages
    model_lr = lr.fit(train_data)
    predictions = model_lr.transform(test_data)

    # Evaluate the performance of the model
    evaluator1_rmse = RegressionEvaluator(labelCol="label",
                                          predictionCol="prediction",
                                          metricName="rmse")
    evaluator1_r2 = RegressionEvaluator(labelCol="label",
                                        predictionCol="prediction",
                                        metricName="r2")

    rmse = evaluator1_rmse.evaluate(predictions)
    r2 = evaluator1_r2.evaluate(predictions)

    print("Root Mean Squared Error (RMSE) on test data = {}".format(rmse))
    print("R^2 on test data = {}".format(r2))
    # Non fine-tuned first model
    metrics_data = [{"RMSE": rmse, "R2": r2, "model": "linear_reg_1"}]
    metrics_df = spark.createDataFrame(metrics_data)
    print("starting saving 1st model")
    metrics_df.coalesce(1).write.mode("overwrite").format("csv") \
        .option("header", "true").save("project/big_data_project/output/Non_fine_tuned_linear_regression_metrics")
    run("hdfs dfs -get project/big_data_project/output/Non_fine_tuned_linear_regression_metrics ./output/model1_no_tune")
    print("saving 1st model done")
    train_data.cache()
    grid = ParamGridBuilder()\
        .addGrid(model_lr.regParam, np.logspace(-2, -1, 2))\
        .addGrid(lr.elasticNetParam, [0.2, 0.6])\
        .build()

    cv = CrossValidator(estimator=lr,
                        estimatorParamMaps=grid,
                        evaluator=evaluator1_rmse,
                        parallelism=5,
                        numFolds=3)

    cvModel = cv.fit(train_data)
    bestModel = cvModel.bestModel
    # Create a list of Rows with parameter combinations and metrics
    cv_results = []
    for i, param_combo in enumerate(grid):
        cv_results.append(Row(
            reg_param=float(param_combo[lr.regParam]),
            elastic_net_param=float(param_combo[lr.elasticNetParam]),
            rmse=float(cvModel.avgMetrics[i])
        ))

    # Create a Spark DataFrame from the results
    cv_results_df = spark.createDataFrame(cv_results)

    # Show the results
    print("Cross-Validation Results:")
    cv_results_df.show(truncate=False)
    cv_results_df.coalesce(1) \
        .write \
        .mode("overwrite") \
        .option("header", "true") \
        .csv("project/big_data_project/output/cv_results_lr")
    run("hdfs dfs -get project/big_data_project/output/cv_results_lr ./output/cv_results_lr")
    model1 = bestModel
    model1.write().overwrite().save("project/big_data_project/models/model1")
    # Run it from root directory of the repository
    run("hdfs dfs -get project/big_data_project/models/model1 models/model1")
    predictions = model1.transform(test_data)

    predictions.select("label", "prediction")\
        .coalesce(1)\
        .write\
        .mode("overwrite")\
        .format("csv")\
        .option("sep", ",")\
        .option("header", "true")\
        .save("project/big_data_project/output/model1_predictions.csv")

    # Run it from root directory of the repository
    run("hdfs dfs -cat project/big_data_project/output/model1_predictions.csv/*.csv > ./output/model1_predictions.csv")

    # Evaluate the performance of the model
    evaluator1_rmse = RegressionEvaluator(labelCol="label",
                                          predictionCol="prediction",
                                          metricName="rmse")
    evaluator1_r2 = RegressionEvaluator(labelCol="label",
                                        predictionCol="prediction",
                                        metricName="r2")

    rmse1 = evaluator1_rmse.evaluate(predictions)
    r21 = evaluator1_r2.evaluate(predictions)

    print("Root Mean Squared Error (RMSE) on test data = {}".format(rmse1))
    print("R^2 on test data = {}".format(r21))

    metrics_data = [{"RMSE": rmse1, "R2": r21, "model": "linear_reg_tuned"}]
    metrics_df = spark.createDataFrame(metrics_data)
    print("model 3")
    metrics_df.coalesce(1).write.mode("overwrite").format("csv") \
        .option("header", "true").save("project/big_data_project/output/fine_tuned_linear_regression_metrics")
    run("hdfs dfs -get project/big_data_project/output/fine_tuned_linear_regression_metrics ./output/model1_tune")
    print("model 3 done")
    from pyspark.ml.regression import GBTRegressor
    gbt = GBTRegressor(maxIter=10)
    model_gbt = gbt.fit(train_data)
    predictions = model_gbt.transform(test_data)
    # Evaluate the performance of the model
    evaluator2_rmse = RegressionEvaluator(labelCol="label",
                                          predictionCol="prediction",
                                          metricName="rmse")
    evaluator2_r2 = RegressionEvaluator(labelCol="label",
                                        predictionCol="prediction",
                                        metricName="r2")

    rmse2 = evaluator2_rmse.evaluate(predictions)
    r22 = evaluator2_r2.evaluate(predictions)

    print("Root Mean Squared Error (RMSE) on test data = {}".format(rmse2))
    print("R^2 on test data = {}".format(r22))
    # save metrics
    metrics_data = [{"RMSE": rmse2, "R2": r22, "model": "GBT_no_tune"}]
    metrics_df = spark.createDataFrame(metrics_data)
    # metrics_df.write.format("json").mode("overwrite").save(f"project/big_data_project/output/{metrics_filename}")
    metrics_df.coalesce(1).write.mode("overwrite").format("csv") \
        .option("header", "true").save("project/big_data_project/output/GBT_no_tune")
    run("hdfs dfs -get project/big_data_project/output/GBT_no_tune ./output/model2_no_tune")
    model_gbt.params
    grid = ParamGridBuilder()\
        .addGrid(gbt.maxDepth, [3, 5])\
        .addGrid(gbt.minInstancesPerNode, [1, 2])\
        .build()
    cv = CrossValidator(estimator=gbt, 
                        estimatorParamMaps=grid, 
                        evaluator=evaluator2_rmse,
                        parallelism=5,
                        numFolds=3)

    cvModel = cv.fit(train_data)
    bestModel = cvModel.bestModel
    gbt_results = []
    for i, param_combo in enumerate(grid):
        gbt_results.append(Row(
            max_depth=int(param_combo[gbt.maxDepth]),
            min_instances_per_node=int(param_combo[gbt.minInstancesPerNode]),
            rmse=float(cvModel.avgMetrics[i])
        ))
    # Create Spark DataFrame
    gbt_results_df = spark.createDataFrame(gbt_results)
    gbt_results_df.coalesce(1) \
        .write \
        .mode("overwrite") \
        .option("header", "true") \
        .csv("project/big_data_project/output/cv_results_gbt")
    run("hdfs dfs -get project/big_data_project/output/cv_results_gbt ./output/cv_results_gbt")
    model2 = bestModel
    model2.write().overwrite().save("project/big_data_project/models/model2")

    # Run it from root directory of the repository
    run("hdfs dfs -get project/big_data_project/models/model2 models/model2")
    predictions = model2.transform(test_data)
    predictions.select("label", "prediction")\
        .coalesce(1)\
        .write\
        .mode("overwrite")\
        .format("csv")\
        .option("sep", ",")\
        .option("header", "true")\
        .save("project/big_data_project/output/model2_predictions.csv")

    # Run it from root directory of the repository
    run("hdfs dfs -cat project/big_data_project/output/model2_predictions.csv/*.csv > ./output/model2_predictions.csv")
    # Evaluate the performance of the model
    evaluator2_rmse = RegressionEvaluator(labelCol="label",
                                          predictionCol="prediction",
                                          metricName="rmse")
    evaluator2_r2 = RegressionEvaluator(labelCol="label",
                                        predictionCol="prediction",
                                        metricName="r2")
    rmse22 = evaluator2_rmse.evaluate(predictions)
    r22 = evaluator2_r2.evaluate(predictions)
    print("Root Mean Squared Error (RMSE) on test data = {}".format(rmse2))
    print("R^2 on test data = {}".format(r22))
    metrics_data = [{"RMSE": rmse22, "R2": r22, "model": "GBT_tune"}]
    metrics_df = spark.createDataFrame(metrics_data)
    # metrics_df.write.format("json").mode("overwrite").save(f"project/big_data_project/output/{metrics_filename}")
    print("model 4 start")
    metrics_df.coalesce(1).write.mode("overwrite").format("csv") \
        .option("header", "true").save("project/big_data_project/output/GBT_tune")
    run("hdfs dfs -get project/big_data_project/output/GBT_tune ./output/model2_tune")
    print("model 4 done")
    models = [[str(model1), rmse1, r21], [str(model2), rmse22, r22]]
    df = spark.createDataFrame(models, ["model", "RMSE", "R2"])
    df.show(truncate=False)
    df.coalesce(1)\
        .write\
        .mode("overwrite")\
        .format("csv")\
        .option("sep", ",")\
        .option("header", "true")\
        .save("project/big_data_project/output/evaluation.csv")
    # Run it from root directory of the repository
    run("hdfs dfs -cat project/big_data_project/output/evaluation.csv/*.csv > ./output/evaluation.csv")


if __name__ == "__main__":
    main()