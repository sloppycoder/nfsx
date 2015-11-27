#!/bin/bash

set +e

docker rmi sloppycoder/ibank-card-service      
docker rmi sloppycoder/ibank-profile-service  
docker rmi sloppycoder/ibank-webapp          
docker rmi sloppycoder/infra-cloud-server   
docker rmi sloppycoder/infra-auth-server   

docker rmi $(docker images | grep "^<none>" | awk ' {print $3} ') || true


