#!/usr/bin/env bash

# compile and package
./mvnw clean package

# 以本地的 Dockerfile 為基礎, 建立 image
docker build \
  --build-arg APP_VERSION=demo-docker-0.0.1.jar \
  -t jerry80409/demo-docker:0.0.1 .
