#!/bin/bash

# data_storage.sh - Script to build the PostgreSQL database

# Create required directories if they don't exist
mkdir -p sql data secrets

# Check if Python environment is set up
if [ ! -d "venv" ]; then
    echo "Creating Python virtual environment..."
    python -m venv venv
    source ./venv/bin/activate
    pip install psycopg2-binary pandas
else
    source ./venv/bin/activate
fi

# Check if password file exists
if [ ! -f "secrets/.psql.pass" ]; then
    echo "Please enter your PostgreSQL password:"
    read -s password
    echo $password > secrets/.psql.pass
    chmod 600 secrets/.psql.pass
fi

# Make build_projectdb.py executable
chmod +x ./scripts/build_projectdb.py

# Run the database build script
echo "Building PostgreSQL database..."
python ./scripts/build_projectdb.py

echo "Database setup process completed!"