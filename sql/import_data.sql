-- import_data.sql - Imports data into Airbnb tables

-- Import hosts data
COPY hosts FROM STDIN WITH CSV HEADER DELIMITER ';' NULL AS 'null';

-- Import locations data
COPY locations FROM STDIN WITH CSV HEADER DELIMITER ';' NULL AS 'null';

-- Import listings data
COPY listings FROM STDIN WITH CSV HEADER DELIMITER ';' NULL AS 'null';

-- Import review scores data
COPY review_scores FROM STDIN WITH CSV HEADER DELIMITER ';' NULL AS 'null';

-- Import listing features data
COPY listing_features FROM STDIN WITH CSV HEADER DELIMITER ';' NULL AS 'null';