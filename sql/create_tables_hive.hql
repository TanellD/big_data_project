-- Create the database
DROP DATABASE IF EXISTS team19_projectdb CASCADE;

CREATE DATABASE IF NOT EXISTS team19_projectdb
LOCATION 'project/hive/warehouse';

-- Use the database
USE team19_projectdb;

-- Drop the tables if they exist (in correct dependency order)
DROP TABLE IF EXISTS listing_features;
DROP TABLE IF EXISTS review_scores;
DROP TABLE IF EXISTS listings;
DROP TABLE IF EXISTS hosts;

-- Create external table for hosts
CREATE EXTERNAL TABLE hosts
STORED AS AVRO
LOCATION 'project/warehouse/hosts'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/hosts.avsc');

-- Create external table for listings
CREATE EXTERNAL TABLE listings
STORED AS AVRO
LOCATION 'project/warehouse/listings'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/listings.avsc');

-- Create external table for review_scores
CREATE EXTERNAL TABLE review_scores
STORED AS AVRO
LOCATION 'project/warehouse/review_scores'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/review_scores.avsc');

-- Create external table for listing_features
CREATE EXTERNAL TABLE listing_features
STORED AS AVRO
LOCATION 'project/warehouse/listing_features'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/listing_features.avsc');