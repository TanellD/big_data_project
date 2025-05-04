-- avg price by score

USE team19_projectdb;

-- Drop existing table (if needed)
DROP TABLE IF EXISTS q5_results;
-- dfs -rm -r /user/team19/project/hive/warehouse/q5;
-- Create external table to store results
CREATE EXTERNAL TABLE q5_results(
  rating_group NUMERIC,
  avg_price FLOAT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q5';

-- Disable unique column names in output
SET hive.resultset.use.unique.column.names = false;

-- Insert data into q5_results
INSERT INTO q5_results


SELECT 
    rating_group,
    CAST(
        AVG(cleaned_price) * 100 AS INT
    ) / 100.0 AS avg_price
FROM (
    SELECT 
        rs.review_scores_rating,
        CASE 
            WHEN rs.review_scores_rating = 100 THEN 10
            ELSE FLOOR(rs.review_scores_rating / 10) + 1 
        END AS rating_group,
        l.price AS cleaned_price
    FROM 
        listings_partitioned l
    JOIN 
        review_scores_bucketed rs ON l.id = rs.listing_id
    WHERE 
        rs.review_scores_rating BETWEEN 1 AND 100 
        AND l.price IS NOT NULL
) AS prepared_data
GROUP BY rating_group
ORDER BY rating_group;


-- Verify results
SELECT * FROM q5_results;