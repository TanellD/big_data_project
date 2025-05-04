#!/bin/bash
url="https://disk.yandex.ru/d/fm6lFOV-v5CqPQ"

wget "$(yadisk-direct $url)" -O data/data.csv