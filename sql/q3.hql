-- Top 10 city by avg price

USE team19_projectdb;

-- Drop existing table (if needed)
DROP TABLE IF EXISTS q3_results;

-- Create external table to store results
CREATE EXTERNAL TABLE q3_results(
  city STRING,
  avg_price FLOAT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q3';

-- Disable unique column names in output
SET hive.resultset.use.unique.column.names = false;


-- Insert data into q3_results
INSERT INTO q3_results

SELECT 
  city,
  AVG(
    price
  ) AS avg_price
FROM listings_partitioned
WHERE price IS NOT NULL
GROUP BY city
HAVING 
  AVG(
    price
  ) IS NOT NULL 
ORDER BY avg_price DESC 
LIMIT 10;

-- Verify results
SELECT * FROM q3_results;