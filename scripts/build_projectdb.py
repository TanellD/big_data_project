#!/usr/bin/env python3
"""Database setup script for the project to process Airbnb data and load it into PostgreSQL."""

import os
import sys
import pandas as pd
import psycopg2 as psql


def get_connection_string():
    """Get connection string from secrets file."""
    try:
        # Read password from secrets file
        with open(os.path.join("secrets", ".psql.pass"), "r", encoding="utf-8") as file:
            password = file.read().rstrip()

        # Build connection string
        conn_string = (
            f"host=hadoop-04.uni.innopolis.ru port=5432 user=team19 "
            f"dbname=team19_projectdb password={password}"
        )
        return conn_string
    except FileNotFoundError:
        print("Password file not found. Please create secrets/.psql.pass with your PostgreSQL password.")
        sys.exit(1)


def preprocess_data():
    """Preprocess the data into normalized tables (locations merged into listings)."""
    print("Preprocessing data...")

    data = pd.read_csv(os.path.join("data", "data.csv"), low_memory=False, sep=';')
    data.columns = data.columns.str.strip()

    # Hosts
    hosts = data[[
        'Host ID', 'Host URL', 'Host Name', 'Host Since', 'Host Location',
        'Host About', 'Host Response Time', 'Host Response Rate', 'Host Acceptance Rate',
        'Host Thumbnail Url', 'Host Picture Url', 'Host Neighbourhood',
        'Host Listings Count', 'Host Total Listings Count', 'Host Verifications'
    ]].copy()
    hosts.columns = [col.lower().replace(' ', '_') for col in hosts.columns]
    hosts.drop_duplicates(subset=['host_id'], inplace=True)

    for col in hosts.select_dtypes(include=['object']).columns:
        hosts[col] = (hosts[col].astype(str).str.replace(r'\r|\n', ' ', regex=True)
                     .str.replace('nan', ''))

    # Review scores
    review_scores = data[[
        'ID', 'Review Scores Rating', 'Review Scores Accuracy', 'Review Scores Cleanliness',
        'Review Scores Checkin', 'Review Scores Communication', 'Review Scores Location',
        'Review Scores Value'
    ]].copy()
    review_scores.columns = [col.lower().replace(' ', '_') for col in review_scores.columns]
    review_scores.drop_duplicates(subset=['id'], inplace=True)
    review_scores.rename(columns={'id': 'listing_id'}, inplace=True)

    for col in review_scores.select_dtypes(include=['object']).columns:
        review_scores[col] = (review_scores[col].astype(str).str.replace(r'\r|\n', ' ', regex=True)
                             .str.replace('nan', ''))

    # Features
    features = []
    if 'Features' in data.columns:
        for _, row in data[['ID', 'Features']].iterrows():
            if pd.notna(row['Features']):
                feature_list = row['Features'].split(',')
                for feature in feature_list:
                    feature = feature.strip()
                    if feature:
                        features.append({
                            'listing_id': row['ID'],
                            'feature_name': feature,
                            'feature_value': 'true'
                        })
    features_df = pd.DataFrame(features)
    features_df.drop_duplicates(subset=['listing_id', 'feature_name'], inplace=True)

    # Listings
    listings = data[[
        'ID', 'Listing Url', 'Scrape ID', 'Last Scraped', 'Name', 'Summary', 'Space',
        'Description', 'Experiences Offered', 'Neighborhood Overview', 'Notes', 'Transit',
        'Access', 'Interaction', 'House Rules', 'Thumbnail Url', 'Medium Url', 'Picture Url',
        'XL Picture Url', 'Host ID', 'Property Type', 'Room Type', 'Accommodates', 'Bathrooms',
        'Bedrooms', 'Beds', 'Bed Type', 'Amenities', 'Square Feet', 'Price', 'Weekly Price',
        'Monthly Price', 'Security Deposit', 'Cleaning Fee', 'Guests Included', 'Extra People',
        'Minimum Nights', 'Maximum Nights', 'Calendar Updated', 'Has Availability',
        'Availability 30', 'Availability 60', 'Availability 90', 'Availability 365',
        'Calendar last Scraped', 'Number of Reviews', 'First Review', 'Last Review',
        'License', 'Jurisdiction Names', 'Cancellation Policy',
        'Calculated host listings count', 'Reviews per Month',

        # Location fields
        'Street', 'Neighbourhood', 'Neighbourhood Cleansed', 'Neighbourhood Group Cleansed',
        'City', 'State', 'Zipcode', 'Market', 'Smart Location', 'Country Code',
        'Country', 'Latitude', 'Longitude', 'Geolocation'
    ]].copy()

    listings.columns = [col.lower().replace(' ', '_') for col in listings.columns]

    for col in listings.select_dtypes(include=['object']).columns:
        listings[col] = (listings[col].astype(str).str.replace(r'\r|\n', ' ', regex=True)
                        .str.replace('nan', ''))

    listings.drop_duplicates(subset=['id'], inplace=True)
    # Save to CSVs
    hosts.to_csv('data/hosts.csv', index=False, sep=';')
    listings.to_csv('data/listings.csv', index=False, sep=';')
    review_scores.to_csv('data/review_scores.csv', index=False, sep=';')
    features_df.to_csv('data/listing_features.csv', index=False, sep=';')

    return {
        'hosts': hosts,
        'listings': listings,
        'review_scores': review_scores,
        'listing_features': features_df
    }


def copy_dataframe_to_table(cursor, dataframe, table_name):
    """Copy pandas DataFrame to PostgreSQL table.

    Args:
        cursor: Database cursor
        dataframe: Pandas DataFrame to copy
        table_name: Target table name
    """
    print(f"Importing data into {table_name} table...")

    # Create a copy of the dataframe to avoid modifying the original
    df_copy = dataframe.copy()

    # Handle date fields specifically - identify date columns
    date_columns = []
    if table_name == 'hosts' and 'host_since' in df_copy.columns:
        date_columns.append('host_since')
    elif table_name == 'listings':
        for col in ['last_scraped', 'first_review', 'last_review',
                   'calendar_updated', 'calendar_last_scraped']:
            if col in df_copy.columns:
                date_columns.append(col)

    # For each date column, properly format dates and set null values to None
    for col in date_columns:
        # Convert to datetime objects first (this will set invalid dates to NaT)
        df_copy[col] = pd.to_datetime(df_copy[col], errors='coerce')
        # Format valid dates as strings, leave NaT as None
        df_copy[col] = df_copy[col].apply(lambda x: x.strftime('%Y-%m-%d') if pd.notna(x) else None)

    # For non-date columns, replace empty strings with None
    for col in df_copy.columns:
        if col not in date_columns:
            df_copy[col] = df_copy[col].apply(lambda x: None if pd.isna(x) or x == '' else x)

    # Use temporary CSV file instead of StringIO to ensure correct handling
    temp_csv = f"temp_{table_name}.csv"
    df_copy.to_csv(temp_csv, index=False, header=True, na_rep='\\N', sep=';')
    columns = ', '.join(df_copy.columns.tolist())
    # Open the file and use copy_expert
    with open(temp_csv, 'r', encoding="utf-8") as file_handle:
        cursor.copy_expert(
            f"COPY {table_name}({columns}) FROM STDIN WITH CSV HEADER DELIMITER ';' NULL '\\N'",
            file_handle
        )

    # Clean up temporary file
    os.remove(temp_csv)


def main():
    """Main function to build project database."""
    # Preprocess data
    tables = preprocess_data()

    # Get connection string
    conn_string = get_connection_string()

    # Connect to the database
    print("Connecting to PostgreSQL database...")
    try:
        with psql.connect(conn_string) as conn:
            print("Connection successful.")

            # Create a cursor
            cur = conn.cursor()

            # Execute create tables script
            print("Creating tables...")
            with open(os.path.join("sql", "create_tables.sql"), encoding="utf-8") as file:
                content = file.read()
                cur.execute(content)
            conn.commit()

            # Import data for each table
            tables_to_import = ['hosts', 'listings', 'review_scores', 'listing_features']
            for table_name in tables_to_import:
                if not tables[table_name].empty:
                    copy_dataframe_to_table(cur, tables[table_name], table_name)

            # Commit changes
            conn.commit()

            # Run test queries
            print("Running test queries...")
            with open(os.path.join("sql", "test_database.sql"), encoding="utf-8") as file:
                commands = file.read().split(';')
                for command in commands:
                    if command.strip():
                        print(f"\nExecuting: {command.strip()}")
                        cur.execute(command)
                        if cur.description:  # Check if query returns rows
                            rows = cur.fetchall()
                            if rows:
                                print(f"Results ({len(rows)} rows):")
                                for row in rows[:5]:  # Display first 5 rows
                                    print(row)
                                if len(rows) > 5:
                                    print("...")
                            else:
                                print("No results returned.")

            print("\nDatabase setup completed successfully!")
            return 0

    except Exception as exception:
        print(f"Error: {exception}")
        return 1


if __name__ == "__main__":
    sys.exit(main())
