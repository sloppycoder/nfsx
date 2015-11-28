#!/bin/bash

docker rmi $(docker images | grep "gcr.io/" | awk ' {print $3} ') || true
docker rmi $(docker images | grep "sloppycoder/" | awk ' {print $3} ') || true
docker rmi $(docker images | grep "^<none>" | awk ' {print $3} ') || true
