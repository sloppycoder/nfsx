FROM java:8
MAINTAINER Li Lin <guru.lin@gmail..com>

ADD cloud-server-2.0.0-SNAPSHOT.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
