-- avg price by property_type

USE team19_projectdb;

-- Drop existing table (if needed)
DROP TABLE IF EXISTS q6_results;

-- Create external table to store results
CREATE EXTERNAL TABLE q6_results(
  property_type STRING,
  avg_price FLOAT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q6';

-- Disable unique column names in output
SET hive.resultset.use.unique.column.names = false;


-- Insert data into q6_results
INSERT INTO q6_results

SELECT 
  property_type,
  AVG(price) AS avg_price
FROM listings_partitioned
WHERE price IS NOT NULL
GROUP BY property_type
HAVING 
  AVG(price) IS NOT NULL 
ORDER BY avg_price DESC;

-- Verify results
SELECT * FROM q6_results;