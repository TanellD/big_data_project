#!/bin/bash
bash ./scripts/data_collection.sh

bash ./scripts/data_storage.sh

bash ./scripts/import_all_tables.sh

echo "Checking using pylint of build_projectdb.py"
pylint scripts/build_projectdb.py