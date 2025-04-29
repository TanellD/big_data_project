#!/bin/bash
url="https://disk.yandex.ru/d/QJ-akgaidGQdjg"

wget "$(yadisk-direct $url)" -O data/data.csv