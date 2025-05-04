#!/bin/bash

if [ ! -d "venv" ]; then
    echo "Creating Python virtual environment..."
    python -m venv venv
    source ./venv/bin/activate
    pip install psycopg2-binary pandas
else
    source ./venv/bin/activate
    echo "Venv activated"
fi

# spark-submit --master yarn scripts/model.py
pyspark --master yarn --conf "spark.driver.extraJavaOptions=-Dhive.metastore.uris=thrift://hadoop-02.uni.innopolis.ru:9883"
