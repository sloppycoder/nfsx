# docker rmi sloppycoder/ibank-httpd ; docker build --rm --tag sloppycoder/ibank-httpd .

FROM httpd:2.4
MAINTAINER Li Lin <guru.lin@gmail..com>

EXPOSE 8080

RUN mv /usr/local/apache2/conf/httpd.conf httpd.conf.orig
ADD httpd.conf /usr/local/apache2/conf/
ADD proxy.conf /usr/local/apache2/conf/extra/

