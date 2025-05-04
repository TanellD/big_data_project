-- how much hosts has description
USE team19_projectdb;

-- Drop existing table (if needed)
DROP TABLE IF EXISTS q2_results;

-- Create external table to store results
CREATE EXTERNAL TABLE q2_results(
  description_status STRING,
  host_count BIGINT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q2';

-- Disable unique column names in output
SET hive.resultset.use.unique.column.names = false;


-- Insert data into q2_results
INSERT INTO q2_results

SELECT 
    description_status,
    COUNT(host_id) AS host_count
FROM (
    SELECT 
        host_id,
        CASE 
            WHEN host_about IS NOT NULL AND TRIM(host_about) != '' THEN 'Has description'
            ELSE 'No description' 
        END AS description_status
    FROM hosts_bucketed
) AS subquery
GROUP BY description_status;

-- Verify results
SELECT * FROM q2_results;