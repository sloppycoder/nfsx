FROM java:8
MAINTAINER Li Lin <guru.lin@gmail..com>

VOLUME /tmp
ADD card-service-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 8120

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
