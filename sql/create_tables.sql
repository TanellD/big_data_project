START TRANSACTION;

-- Drop tables if they exist (in reverse order of dependencies)
DROP TABLE IF EXISTS listing_features CASCADE;
DROP TABLE IF EXISTS review_scores CASCADE;
DROP TABLE IF EXISTS listings CASCADE;
DROP TABLE IF EXISTS hosts CASCADE;

-- Hosts table
CREATE TABLE IF NOT EXISTS hosts (
    host_id DECIMAL(20, 7) PRIMARY KEY,
    host_url TEXT,
    host_name TEXT,
    host_since DATE,
    host_location TEXT,
    host_about TEXT,
    host_response_time TEXT,
    host_response_rate DECIMAL(20, 7),
    host_acceptance_rate TEXT,
    host_thumbnail_url TEXT,
    host_picture_url TEXT,
    host_neighbourhood TEXT,
    host_listings_count DECIMAL(20, 7),
    host_total_listings_count DECIMAL(20, 7),
    host_verifications TEXT
);

-- Listings table (merged with location fields)
CREATE TABLE IF NOT EXISTS listings (
    id TEXT PRIMARY KEY,
    listing_url TEXT,
    scrape_id TEXT,
    last_scraped DATE,
    name TEXT,
    summary TEXT,
    space TEXT,
    description TEXT,
    experiences_offered TEXT,
    neighborhood_overview TEXT,
    notes TEXT,
    transit TEXT,
    access TEXT,
    interaction TEXT,
    house_rules TEXT,
    thumbnail_url TEXT,
    medium_url TEXT,
    picture_url TEXT,
    xl_picture_url TEXT,
    host_id DECIMAL(20, 7) REFERENCES hosts(host_id),

    -- Location fields
    street TEXT,
    neighbourhood TEXT,
    neighbourhood_cleansed TEXT,
    neighbourhood_group_cleansed TEXT,
    city TEXT,
    state TEXT,
    zipcode TEXT,
    market TEXT,
    smart_location TEXT,
    country_code TEXT,
    country TEXT,
    latitude DECIMAL(20, 7),
    longitude DECIMAL(20, 7),
    geolocation TEXT,

    -- Listing details
    property_type TEXT,
    room_type TEXT,
    accommodates DECIMAL(20, 7),
    bathrooms DECIMAL(20, 7),
    bedrooms DECIMAL(20, 7),
    beds DECIMAL(20, 7),
    bed_type TEXT,
    amenities TEXT,
    square_feet DECIMAL(20, 7),
    price TEXT,
    weekly_price TEXT,
    monthly_price TEXT,
    security_deposit TEXT,
    cleaning_fee TEXT,
    guests_included DECIMAL(20, 7),
    extra_people TEXT,
    minimum_nights DECIMAL(20, 7),
    maximum_nights DECIMAL(20, 7),
    calendar_updated TEXT,
    has_availability TEXT,
    availability_30 DECIMAL(20, 7),
    availability_60 DECIMAL(20, 7),
    availability_90 DECIMAL(20, 7),
    availability_365 DECIMAL(20, 7),
    calendar_last_scraped DATE,
    number_of_reviews DECIMAL(20, 7),
    first_review DATE,
    last_review DATE,
    license TEXT,
    jurisdiction_names TEXT,
    cancellation_policy TEXT,
    calculated_host_listings_count DECIMAL(20, 7),
    reviews_per_month DECIMAL(20, 7)
);

-- Review scores
CREATE TABLE IF NOT EXISTS review_scores (
    listing_id TEXT PRIMARY KEY REFERENCES listings(id),
    review_scores_rating DECIMAL(20, 7),
    review_scores_accuracy DECIMAL(20, 7),
    review_scores_cleanliness DECIMAL(20, 7),
    review_scores_checkin DECIMAL(20, 7),
    review_scores_communication DECIMAL(20, 7),
    review_scores_location DECIMAL(20, 7),
    review_scores_value DECIMAL(20, 7)
);

-- Features
CREATE TABLE IF NOT EXISTS listing_features (
    listing_id TEXT REFERENCES listings(id),
    feature_name TEXT,
    feature_value TEXT,
    PRIMARY KEY (listing_id, feature_name)
);

-- Indexes
CREATE INDEX idx_listings_host_id ON listings(host_id);
CREATE INDEX idx_listings_property_type ON listings(property_type);
CREATE INDEX idx_listings_room_type ON listings(room_type);
CREATE INDEX idx_listings_city ON listings(city);
CREATE INDEX idx_listings_country ON listings(country);
CREATE INDEX idx_listings_reviews ON listings(number_of_reviews);

-- Set date style
SET datestyle TO iso, ymd;

COMMIT;
