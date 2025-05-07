USE team19_projectdb;
DROP TABLE IF EXISTS lr_gridsearch;

CREATE EXTERNAL TABLE lr_gridsearch (
    reg_param DOUBLE,
    elastic_net_param DOUBLE,
    rmse DOUBLE
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/cv_results_lr'
TBLPROPERTIES ('skip.header.line.count'='1');