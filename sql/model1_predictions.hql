USE team19_projectdb;
DROP TABLE IF EXISTS model1_predictions;

CREATE EXTERNAL TABLE model1_predictions (
    label DOUBLE,
    prediction DOUBLE
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/model1_predictions.csv'
TBLPROPERTIES ('skip.header.line.count'='1');