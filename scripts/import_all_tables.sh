#!/bin/bash

# Load PostgreSQL password from secrets
password=$(head -n 1 secrets/.psql.pass)

# Database connection string and parameters
DB_URL="jdbc:postgresql://hadoop-04.uni.innopolis.ru/team19_projectdb"
HDFS_DIR="/user/team19/project/warehouse"
HDFS_AVSC_DIR="/user/team19/project/warehouse/avsc"
LOCAL_OUTPUT_DIR="output"
WORKER_COUNT=1  # Number of parallel tasks

# Clean local output directory
echo "Cleaning local output directory..."
rm -rf $LOCAL_OUTPUT_DIR
mkdir -p $LOCAL_OUTPUT_DIR

# Clean HDFS directories
echo "Cleaning old files from HDFS..."
hdfs dfs -rm -r -skipTrash $HDFS_DIR
hdfs dfs -mkdir -p $HDFS_DIR

# Create AVSC folder in HDFS
echo "Creating HDFS folder for .avsc files..."
hdfs dfs -mkdir -p $HDFS_AVSC_DIR

# List all tables in the database
TABLES=$(sqoop list-tables --connect $DB_URL --username team19 --password $password)
echo "Found tables: $TABLES"

# Loop through each table and import it into HDFS
for TABLE in $TABLES; do
  echo "Starting import for table: $TABLE"
  
  # Clean any leftover files from previous runs
  rm -f *.java *.avsc
  
  # Run Sqoop import for the current table
  sqoop import \
    --connect $DB_URL \
    --username team19 \
    --password $password \
    --compression-codec=snappy \
    --compress \
    --as-avrodatafile \
    --warehouse-dir=$HDFS_DIR \
    --m $WORKER_COUNT \
    --table $TABLE
  
  # Move AVSC schema files to HDFS folder
  echo "Moving .avsc schema files to HDFS..."
  hdfs dfs -put -f *.avsc $HDFS_AVSC_DIR
  
  # Move generated files to the local output directory
  echo "Moving generated files to output directory..."
  mv *.avsc *.java $LOCAL_OUTPUT_DIR/ 2>/dev/null || true
  
  echo "✅ Import for table $TABLE completed!"
done

echo "All tables have been imported successfully to HDFS."

# Verify HDFS directory contents
echo "Checking HDFS directory contents..."
hdfs dfs -ls -R $HDFS_DIR