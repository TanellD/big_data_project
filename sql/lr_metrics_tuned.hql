USE team19_projectdb;
DROP TABLE IF EXISTS lr_metrics_tuned;

CREATE EXTERNAL TABLE lr_metrics_tuned (
    R2 DOUBLE,
    RMSE DOUBLE,
    model STRING
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/fine_tuned_linear_regression_metrics'
TBLPROPERTIES ('skip.header.line.count'='1');