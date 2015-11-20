FROM java:8
MAINTAINER Li Lin <guru.lin@gmail..com>

VOLUME /tmp
ADD profile-service-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 8110

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
