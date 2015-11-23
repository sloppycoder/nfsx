FROM java:openjdk-8-jre
MAINTAINER Li Lin <guru.lin@gmail..com>

ADD card-service-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 8120

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
