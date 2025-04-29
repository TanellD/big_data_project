USE team19_projectdb;
SET hive.enforce.bucketing = true;
SET hive.exec.dynamic.partition.mode=nonstrict;
SET hive.exec.max.dynamic.partitions=5000;
SET hive.exec.max.dynamic.partitions.pernode=1000;

-- Drop the table if it exists
DROP TABLE IF EXISTS hosts_bucketed;

-- Create a bucketed table directly using host_location for bucketing
CREATE EXTERNAL TABLE hosts_bucketed (
  host_id DECIMAL(20,7),
  host_url STRING,
  host_name STRING,
  host_since DATE,
  host_location STRING,
  host_about STRING,
  host_response_time STRING,
  host_response_rate DECIMAL(20,7),
  host_acceptance_rate STRING,
  host_listings_count DECIMAL(20,7),
  host_total_listings_count DECIMAL(20,7),
  host_verifications STRING
)
CLUSTERED BY (host_location) INTO 1000 BUCKETS
STORED AS AVRO
LOCATION 'project/warehouse/hosts_bucketed';

-- Insert data into the bucketed table
INSERT OVERWRITE TABLE hosts_bucketed
SELECT 
  CAST(host_id AS DECIMAL(20,7)) AS host_id,
  host_url,
  host_name,
  FROM_UNIXTIME(CAST(host_since/1000 AS BIGINT), 'yyyy-MM-dd') AS host_since,
  host_location,
  host_about,
  host_response_time,
  CAST(host_response_rate AS DECIMAL(20,7)) AS host_response_rate,
  host_acceptance_rate,
  CAST(host_listings_count AS DECIMAL(20,7)) AS host_listings_count,
  CAST(host_total_listings_count AS DECIMAL(20,7)) AS host_total_listings_count,
  host_verifications
FROM hosts;