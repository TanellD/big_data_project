from pyspark.sql import SparkSession
def run(command):
    import os
    return os.popen(command).read()

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

sc = spark.sparkContext

# Non fine-tuned first model
metrics_filename = "Non_fine_tuned_linear_regression_metrics"
metrics_data = [{"RMSE": "1", "R2": "0", "model": "linear_reg_1"}]
metrics_df = spark.createDataFrame(metrics_data)
metrics_df.write.format("json").mode("overwrite").save(f"project/big_data_project/output/{metrics_filename}")
# model2.write().overwrite().save("project/big_data_project/models/model2")
run("hdfs dfs -get project/big_data_project/output/Non_fine_tuned_linear_regression_metrics ../output/model1_no_tune")