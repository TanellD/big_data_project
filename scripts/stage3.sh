#!/bin/bash

chmod +x scripts/run_model.sh

export YARN_CONF_DIR=/etc/hadoop/conf
echo "Set YARN_CONF_DIR to $YARN_CONF_DIR"
export PYSPARK_PYTHON=python3.11
export PYSPARK_DRIVER_PYTHON=python3.11

echo "Cleaning HDFS data, models, and output directories..."
hdfs dfs -rm -r -f project/big_data_project/data >/dev/null 2>&1 || true
hdfs dfs -rm -r -f project/big_data_project/models >/dev/null 2>&1 || true
hdfs dfs -rm -r -f project/big_data_project/output >/dev/null 2>&1 || true

echo "Recreating HDFS structure..."
hdfs dfs -mkdir -p project/big_data_project/data/train
hdfs dfs -mkdir -p project/big_data_project/data/test
echo "Running ML modeling script..."


DRIVER_MEMORY="4g"
EXECUTOR_MEMORY="4g"
EXECUTOR_CORES=4
NUM_EXECUTORS=4


spark-submit \
    --master yarn \
    --driver-memory $DRIVER_MEMORY \
    --executor-memory $EXECUTOR_MEMORY \
    --executor-cores $EXECUTOR_CORES \
    --num-executors $NUM_EXECUTORS \
    --conf spark.yarn.appMasterEnv.PYSPARK_PYTHON=$PYSPARK_PYTHON \
    --conf spark.executorEnv.PYSPARK_PYTHON=$PYSPARK_PYTHON \
    scripts/model.py

echo "Emptying HDFS trash..."