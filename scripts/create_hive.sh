#!/bin/bash

# Directory containing your SQL files
SQL_DIR="./sql"
OUTPUT_DIR="./output"

HDFS_AVSC_DIR="/user/team19/project/warehouse/avsc"
LOCAL_OUTPUT_DIR="output"

# Get Hive password
password=$(head -n 1 secrets/.hive.pass)

# Beeline connection string
BEELINE_CONN="jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $password"

# Colors for output
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# List of blue-highlighted SQL files to run (now renamed to .hql)
BLUE_FILES=(
  "create_tables_hive.hql"
  "create_hosts_bucketed.hql"
  "describe_tables_hive.hql"
  "partitioned_and_bucketed_tables.hql"
  "test_hive.hql"
  "drop_other_tables_hive.hql"
)

# Create output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Create AVSC folder in HDFS
echo "Creating HDFS folder for .avsc files..."
hdfs dfs -mkdir -p $HDFS_AVSC_DIR



# Move AVSC schema files to HDFS folder
echo "Moving .avsc schema files to HDFS..."
hdfs dfs -put -f *.avsc $HDFS_AVSC_DIR

# Move generated files to the local output directory
echo "Moving generated files to output directory..."
mv *.avsc *.java $LOCAL_OUTPUT_DIR/ 2>/dev/null || true


echo "Stage 1 generated files are moved to output directory✓"

# Function to run a Hive HQL script file
run_hive_script() {
  local script="$SQL_DIR/$1"
  local output_file="$OUTPUT_DIR/$(basename "$1" .hql)_results.txt"
  
  if [ ! -f "$script" ]; then
    echo -e "${RED}Error: Script file '$script' not found${NC}"
    return 1
  fi
  
  echo -e "${BLUE}=================================================${NC}"
  echo -e "${YELLOW}Running Hive script: $1${NC}"
  echo -e "${BLUE}=================================================${NC}"
  
  # Run the script with beeline and save output to file
  beeline -u $BEELINE_CONN -f "$script" > "$output_file" 2>&1
  
  if [ $? -eq 0 ]; then
    echo -e "${GREEN}✓ Script executed successfully: $1${NC}"
    echo -e "${GREEN}✓ Results saved to: $output_file${NC}"
    return 0
  else
    echo -e "${RED}✗ Script execution failed: $1${NC}"
    echo -e "${YELLOW}Check error details in: $output_file${NC}"
    return 1
  fi
}

# Main execution
echo -e "${BLUE}=================================================${NC}"
echo -e "${BLUE}       RUNNING HIGHLIGHTED HIVE HQL SCRIPTS       ${NC}"
echo -e "${BLUE}=================================================${NC}"

# Check if SQL directory exists
if [ ! -d "$SQL_DIR" ]; then
  echo -e "${RED}Error: SQL directory '$SQL_DIR' not found${NC}"
  echo "Please make sure your HQL files are in the '$SQL_DIR' directory"
  exit 1
fi

# Run each blue-highlighted file in sequence
for file in "${BLUE_FILES[@]}"; do
  run_hive_script "$file"
  
  # If a script fails, ask if we should continue
  if [ $? -ne 0 ]; then
    read -p "Script failed. Continue with the next script? (y/n): " choice
    if [[ ! "$choice" =~ ^[Yy] ]]; then
      echo "Execution stopped."
      exit 1
    fi
  fi
  
  # Small delay between script executions
  sleep 1
done

# Consolidate all results into one file
echo -e "${BLUE}=================================================${NC}"
echo -e "${YELLOW}Consolidating all results into hive_results.txt${NC}"

# Create header for consolidated results file
echo "######## CONSOLIDATED HIVE SCRIPT RESULTS ########" > "$OUTPUT_DIR/hive_results.txt"
echo "Generated on: $(date)" >> "$OUTPUT_DIR/hive_results.txt"
echo "" >> "$OUTPUT_DIR/hive_results.txt"

# Append each individual result file
for file in "${BLUE_FILES[@]}"; do
  base_name=$(basename "$file" .hql)
  result_file="$OUTPUT_DIR/${base_name}_results.txt"
  
  if [ -f "$result_file" ]; then
    echo "######## RESULTS FROM: $file ########" >> "$OUTPUT_DIR/hive_results.txt"
    cat "$result_file" >> "$OUTPUT_DIR/hive_results.txt"
    echo -e "\n\n" >> "$OUTPUT_DIR/hive_results.txt"
  fi
done

echo -e "${GREEN}✓ All results consolidated into: $OUTPUT_DIR/hive_results.txt${NC}"
echo -e "${BLUE}=================================================${NC}"
echo -e "${GREEN}All highlighted HQL scripts execution completed!${NC}"
echo -e "${BLUE}=================================================${NC}"