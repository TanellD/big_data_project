USE team19_projectdb;
DROP TABLE IF EXISTS gbt_metrics_tuned;

CREATE EXTERNAL TABLE gbt_metrics_tuned (
    R2 DOUBLE,
    RMSE DOUBLE,
    model STRING
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/GBT_tune'
TBLPROPERTIES ('skip.header.line.count'='1');