USE team19_projectdb;
SET hive.exec.max.dynamic.partitions=5000;
SET hive.exec.max.dynamic.partitions.pernode=1000;
SET hive.exec.dynamic.partition.mode=nonstrict;

DROP TABLE IF EXISTS listings_partitioned;
DROP TABLE IF EXISTS review_scores_bucketed;

-- Create partitioned listings table with hashed partition columns
CREATE EXTERNAL TABLE listings_partitioned (
  id STRING,
  listing_url STRING,
  scrape_id STRING,
  last_scraped DATE,
  name STRING,
  -- Include all other columns except country and city
  host_id DECIMAL(20,7),
  -- More columns
  street STRING,
  -- More location fields excluding country and city
  property_type STRING,
  room_type STRING,
  accommodates DECIMAL(20,7),
  bathrooms DECIMAL(20,7),
  bedrooms DECIMAL(20,7),
  beds DECIMAL(20,7),
  -- Rest of the columns
  price STRING,
  number_of_reviews DECIMAL(20,7),
  reviews_per_month DECIMAL(20,7),
  city STRING
)
PARTITIONED BY (country STRING)
STORED AS AVRO
LOCATION 'project/warehouse/listings_partitioned';

-- Insert data into the partitioned table with hashed partition columns (range 0-1000)
INSERT OVERWRITE TABLE listings_partitioned
PARTITION (country)
SELECT 
  id, 
  listing_url, 
  scrape_id, 
  FROM_UNIXTIME(CAST(last_scraped/1000 AS BIGINT), 'yyyy-MM-dd') AS last_scraped, 
  name,
  host_id,
  street,
  property_type, 
  room_type, 
  accommodates, 
  bathrooms, 
  bedrooms, 
  beds,
  price, 
  number_of_reviews, 
  reviews_per_month,
  city,
  -- Make sure this is the very last column to match your partition definition
  COALESCE(country, 'Unknown')
FROM listings;

-- Create bucketed review scores table
CREATE EXTERNAL TABLE review_scores_bucketed (
  listing_id STRING,
  review_scores_rating DECIMAL(20,7),
  review_scores_accuracy DECIMAL(20,7),
  review_scores_cleanliness DECIMAL(20,7),
  review_scores_checkin DECIMAL(20,7),
  review_scores_communication DECIMAL(20,7),
  review_scores_location DECIMAL(20,7),
  review_scores_value DECIMAL(20,7)
)
CLUSTERED BY (listing_id) INTO 4 BUCKETS
STORED AS AVRO
LOCATION 'project/warehouse/review_scores_bucketed';

-- Enable bucketing in Hive
SET hive.enforce.bucketing = true;

-- Insert data into the bucketed table
INSERT OVERWRITE TABLE review_scores_bucketed
SELECT * FROM review_scores;
