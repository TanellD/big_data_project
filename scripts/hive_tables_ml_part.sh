#!/bin/bash

# Script to execute HQL files for creating Hive tables
# Usage: ./run_hql_scripts.sh password


PASSWORD=$(head -n 1 secrets/.hive.pass)
TEAM_NUMBER=19
HIVE_SERVER="hadoop-03.uni.innopolis.ru:10001"
HIVE_USER="team${TEAM_NUMBER}"
SQL_DIR="sql"

# List of all HQL files to execute (excluding db.hql which we already executed)
HQL_FILES=(
    # "lr_metrics_no_tune.hql"
    "lr_metrics_tuned.hql"
    # "gbt_metrics_no_tune.hql"
    "gbt_metrics_tuned.hql"
    "model1_predictions.hql"
    "model2_predictions.hql"
    "evaluation_results.hql"
    "grid_search_gbt.hql"
    "grid_search_lr.hql"
)

# Execute each HQL file
for hql_file in "${HQL_FILES[@]}"; do
    echo "Executing ${hql_file}..."
    beeline -u "jdbc:hive2://${HIVE_SERVER}" -n "${HIVE_USER}" -p "${PASSWORD}" -f "${SQL_DIR}/${hql_file}"
done

# Verify tables were created
echo "Verifying table creation..."
beeline -u "jdbc:hive2://${HIVE_SERVER}" -n "${HIVE_USER}" -p "${PASSWORD}" --showHeader=true --outputformat=table -e "USE team${TEAM_NUMBER}_projectdb; SHOW TABLES;"

echo "All HQL scripts executed successfully"