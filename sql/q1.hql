-- year when host register
USE team19_projectdb;

-- Drop existing table (if needed)
DROP TABLE IF EXISTS q1_results;

-- Create external table to store results
CREATE EXTERNAL TABLE q1_results(
  host_since_year NUMERIC,
  host_count BIGINT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q1';

-- Disable unique column names in output
SET hive.resultset.use.unique.column.names = false;

-- Insert data into q1_results
INSERT INTO q1_results
SELECT 
  YEAR(host_since) AS host_since_year,  -- Extract year using Hive's YEAR()
  COUNT(host_id) AS host_count          -- Count hosts per year
FROM hosts_bucketed 
GROUP BY YEAR(host_since)               -- Group by the year expression
ORDER BY YEAR(host_since);              -- Order by the year expression

-- Verify results
SELECT * FROM q1_results;