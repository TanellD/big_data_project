use team19_projectdb;
SELECT country, COUNT(*) as count 
FROM listings 
GROUP BY country 
ORDER BY count DESC;