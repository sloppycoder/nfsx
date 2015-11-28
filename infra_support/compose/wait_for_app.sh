#!/bin/bash

echo Waiting for application to boot ...
for i in {1..20}; do 
   echo "    checking..."
   curl -sL $PUBLIC_BASE_URL/app | grep csrf_token > /dev/null && break 
   sleep 15 
done 

# the command below determines the return status of the script
curl -sL $PUBLIC_BASE_URL/app | grep csrf_token  > /dev/null
