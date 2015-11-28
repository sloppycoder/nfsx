#!/bin/bash

echo Shutting down application...

docker stop compose_httpd_1

docker stop compose_webapp_1
docker stop compose_cardsvc_1
docker stop compose_profilesvc_1

docker stop compose_cloudsvr_1
docker stop compose_authsvr_1

docker stop compose_redis_1

docker ps -a -q | xargs docker rm

exit 0

