-- Check hosts table
SELECT * FROM hosts LIMIT 10;

-- Check listings table
SELECT * FROM listings LIMIT 10;

-- Check review scores table
SELECT * FROM review_scores LIMIT 10;

-- Check listing features table
SELECT * FROM listing_features LIMIT 10;

-- Join listings and hosts
SELECT l.id, l.name, h.host_name, l.price
FROM listings l
JOIN hosts h ON l.host_id = h.host_id
LIMIT 10;

-- Join listings and review scores
SELECT l.id, l.name, l.city, l.country, rs.review_scores_rating
FROM listings l
LEFT JOIN review_scores rs ON l.id = rs.listing_id
LIMIT 10;
