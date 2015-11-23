FROM java:openjdk-8-jre
MAINTAINER Li Lin <guru.lin@gmail..com>

ADD auth-server-2.0.0-SNAPSHOT.jar app.jar

EXPOSE 19999

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
