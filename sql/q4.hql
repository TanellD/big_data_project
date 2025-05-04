-- Top 10 city by most frequent

USE team19_projectdb;

-- Drop existing table (if needed)
DROP TABLE IF EXISTS q4_results;
-- dfs -rm -r /user/team19/project/hive/warehouse/q4;
-- Create external table to store results
CREATE EXTERNAL TABLE q4_results(
  city STRING,
  count_city BIGINT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q4';

-- Disable unique column names in output
SET hive.resultset.use.unique.column.names = false;

-- Insert data into q4_results
INSERT INTO q4_results

select city, count(id) as count_city from listings_partitioned
group by city
order by count_city desc
Limit 10;

-- Verify results
SELECT * FROM q4_results;