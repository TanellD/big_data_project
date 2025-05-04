#!/bin/bash
# Directory containing your SQL files
SQL_DIR="./sql"
OUTPUT_DIR="./output"

# Get Hive password
password=$(head -n 1 secrets/.hive.pass)
# Hardcoded password (from your example, but you should use the line above instead)
# password="4SEftmTP447s0qFB"

# Beeline connection string
BEELINE_CONN="jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $password"

# Colors for output
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Create output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Function to run a specific query file
run_query() {
    local query_num="$1"
    local query_file="$SQL_DIR/q${query_num}.hql"
    local output_file="$OUTPUT_DIR/q${query_num}.csv"
    
    if [ ! -f "$query_file" ]; then
        echo -e "${RED}Error: Query file '$query_file' not found${NC}"
        return 1
    fi
    
    echo -e "${BLUE}=================================================${NC}"
    echo -e "${YELLOW}Running query: q${query_num}.hql${NC}"
    echo -e "${BLUE}=================================================${NC}"
    
    # Run the query with beeline and save output to CSV file
    beeline -u $BEELINE_CONN -f "$query_file" --hiveconf hive.resultset.use.unique.column.names=false > "$output_file" 2>&1
    
    if [ $? -eq 0 ]; then
        echo -e "${GREEN}✓ Query executed successfully: q${query_num}.hql${NC}"
        echo -e "${GREEN}✓ Results saved to: $output_file${NC}"
        return 0
    else
        echo -e "${RED}✗ Query execution failed: q${query_num}.hql${NC}"
        echo -e "${YELLOW}Check error details in: $output_file${NC}"
        return 1
    fi
}

# Main execution
echo -e "${BLUE}=================================================${NC}"
echo -e "${BLUE}       RUNNING QUERIES Q1 THROUGH Q6             ${NC}"
echo -e "${BLUE}=================================================${NC}"

# Check if SQL directory exists
if [ ! -d "$SQL_DIR" ]; then
    echo -e "${RED}Error: SQL directory '$SQL_DIR' not found${NC}"
    echo "Please make sure your HQL files are in the '$SQL_DIR' directory"
    exit 1
fi

# Run queries q1 through q6
for i in {1..6}; do
    run_query "$i"
    
    # If a query fails, ask if we should continue
    if [ $? -ne 0 ]; then
        read -p "Query failed. Continue with the next query? (y/n): " choice
        if [[ ! "$choice" =~ ^[Yy] ]]; then
            echo "Execution stopped."
            exit 1
        fi
    fi
    
    # Small delay between query executions
    sleep 1
done

echo -e "${BLUE}=================================================${NC}"
echo -e "${GREEN}All queries (q1-q6) execution completed!${NC}"
echo -e "${BLUE}=================================================${NC}"