USE team19_projectdb;
DROP TABLE IF EXISTS evaluation_results;

CREATE EXTERNAL TABLE evaluation_results (
    model STRING,
    RMSE DOUBLE,
    R2 DOUBLE
)
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"",
   "escapeChar"    = "\\"
)
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/evaluation.csv'
TBLPROPERTIES ('skip.header.line.count'='1');