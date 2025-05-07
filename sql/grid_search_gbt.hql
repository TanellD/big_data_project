USE team19_projectdb;
DROP TABLE IF EXISTS gbt_gridsearch;

CREATE EXTERNAL TABLE gbt_gridsearch (
    max_depth INT,
    min_instances_per_node DOUBLE,
    rmse DOUBLE
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
STORED AS TEXTFILE
LOCATION '/user/team19/project/big_data_project/output/cv_results_gbt'
TBLPROPERTIES ('skip.header.line.count'='1');