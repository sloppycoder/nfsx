FROM java:8
MAINTAINER Li Lin <guru.lin@gmail..com>

VOLUME /config

ADD cloud-server-2.0.0-SNAPSHOT.jar app.jar

EXPOSE 8765

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
