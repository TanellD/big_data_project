USE team19_projectdb;

-- Verify partitioned table

SELECT * 
FROM listings_partitioned 
LIMIT 10;

-- Join the tables to test relationships
SELECT l.name, l.property_type, r.review_scores_rating, r.review_scores_cleanliness
FROM listings_partitioned l
JOIN review_scores_bucketed r ON l.id = r.listing_id
LIMIT 10;