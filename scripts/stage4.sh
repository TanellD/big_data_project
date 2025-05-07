#!/bin/bash

chmod +x scripts/hive_tables_ml_part.sh
bash scripts/hive_tables_ml_part.sh

echo "Checking using pylint of model.py"
pylint scripts/model.py