#!/bin/bash

set -o errexit
umask 0027

JAVA_OPTS=-Djava.security.egd=file:/dev/./urandom

if [ "$1" = "" ]; then
  JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom -Dspring.active.profiles=h2"
else
  JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom $1"
fi

java $JAVA_OPTS -jar /app.jar

