#!/usr/bin/env bash
docker run -d \
    --name demo-docker \
    -p 8080:8080 \
    jerry80409/demo-docker:0.0.1
