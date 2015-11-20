FROM java:8
MAINTAINER Li Lin <guru.lin@gmail..com>

VOLUME /tmp
ADD webapp-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 8000

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
