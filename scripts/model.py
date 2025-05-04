from pyspark.sql import SparkSession

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

spark

hosts_bucketed = spark.read.format("avro").table('team19_projectdb.hosts_bucketed')
listings_partitioned = spark.read.format("avro").table('team19_projectdb.listings_partitioned')
review_scores_bucketed = spark.read.format("avro").table('team19_projectdb.review_scores_bucketed')

hosts_bucketed.show()
listings_partitioned.show()
review_scores_bucketed.show()