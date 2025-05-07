#!/bin/bash

PYTHON_VERSION="3.11.7"
VENV_DIR="venv-3.11.7"

# Load Hadoop/YARN environment if available
module load hadoop 2>/dev/null || echo "Hadoop module not available"
module load spark 2>/dev/null || echo "Spark module not available"

# Set Hadoop/YARN configuration directories (adjust paths as needed for your cluster)
export HADOOP_CONF_DIR=${HADOOP_CONF_DIR:-/etc/hadoop/conf}
export YARN_CONF_DIR=${YARN_CONF_DIR:-/etc/hadoop/conf}

if [ ! -d "$VENV_DIR" ]; then
    echo "Creating Python $PYTHON_VERSION virtual environment..."
    module load python/$PYTHON_VERSION 2>/dev/null || echo "Python module not available, using system Python"
    
    # Check if python3.11 exists
    if command -v python3.11 &>/dev/null; then
        python3.11 -m venv $VENV_DIR
    else
        echo "Python 3.11 not found. Trying with available Python version."
        python -m venv $VENV_DIR
    fi
    
    source ./$VENV_DIR/bin/activate
    pip install --upgrade pip
    pip install psycopg2-binary pandas pyspark
    echo "Virtual environment created with Python $PYTHON_VERSION"
else
    source ./$VENV_DIR/bin/activate
    echo "Virtual environment activated"
fi

# Package the virtual environment for Spark
if [ ! -f "$VENV_DIR.zip" ]; then
    echo "Packaging virtual environment for Spark..."
    zip -r $VENV_DIR.zip $VENV_DIR
fi

# Set Python executable for Spark
export PYSPARK_PYTHON=./$VENV_DIR/bin/python
export PYSPARK_DRIVER_PYTHON=python  # For the driver node

# # Submit your Spark job
# spark-submit --master yarn \
#     --conf "spark.driver.extraJavaOptions=-Dhive.metastore.uris=thrift://hadoop-02.uni.innopolis.ru:9883" \
#     --archives $VENV_DIR.zip#$VENV_DIR \
#     scripts/model.py
spark-submit --master yarn \
    --conf "spark.driver.extraJavaOptions=-Dhive.metastore.uris=thrift://hadoop-02.uni.innopolis.ru:9883" \
    --conf "spark.yarn.appMasterEnv.PYSPARK_PYTHON=$VENV_DIR/bin/python" \
    --conf "spark.yarn.appMasterEnv.PYSPARK_DRIVER_PYTHON=$VENV_DIR/bin/python" \
    --archives $VENV_DIR.zip#$VENV_DIR \
    scripts/model.py