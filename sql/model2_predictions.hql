USE team19_projectdb;
DROP TABLE IF EXISTS model2_predictions;

CREATE EXTERNAL TABLE model2_predictions (
    label DOUBLE,
    prediction DOUBLE
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/model2_predictions.csv'
TBLPROPERTIES ('skip.header.line.count'='1');