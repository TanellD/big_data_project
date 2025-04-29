#!/bin/bash

# Load PostgreSQL password from secrets
password=$(head -n 1 secrets/pg_pass)

# Database connection string and parameters
DB_URL="jdbc:postgresql://hadoop-04.uni.innopolis.ru/team19_projectdb"
HDFS_DIR="/user/team19/project/warehouse"
HDFS_AVSC_DIR="/user/team19/project/warehouse/avsc"
WORKER_COUNT=1  # Number of parallel tasks (reduce or increase based on your resources)

# Optional: clean the warehouse directory in HDFS (uncomment if needed)
echo "Cleaning old files from HDFS..."
hdfs dfs -rm -r -skipTrash $HDFS_DIR

# Make sure AVSC folder exists in HDFS
echo "Creating HDFS folder for .avsc files..."
hdfs dfs -mkdir -p $HDFS_AVSC_DIR

# List all tables in the database and store them in a variable
TABLES=$(sqoop list-tables --connect $DB_URL --username team19 --password $password)
echo "$TABLES are found"

# Loop through each table and import it into HDFS
for TABLE in $TABLES; do
  echo "Starting import for table: $TABLE"

  # Clean up old data in HDFS for the current table (optional)
  # echo "Cleaning old files for $TABLE in HDFS..."
  # hdfs dfs -rm -r -skipTrash $HDFS_DIR/$TABLE

  # Run Sqoop import for the current table (as AVRO file format with Snappy compression)
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
  hdfs dfs -put output/*.avsc $HDFS_AVSC_DIR

  # Move .java files to the output folder (optional, as per instruction)
  echo "Moving .java files to output directory..."
  mv *.avsc output/
  mv *.java output/

  echo "✅ Import for table $TABLE completed!"
done

echo "All tables have been imported successfully to HDFS."

# You can check the contents of the HDFS folder to confirm everything is in place
echo "Checking HDFS directory contents..."
hdfs dfs -ls $HDFS_DIR
