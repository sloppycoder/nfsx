## Minimal infra support for running demo application

### Modules
#### auth-server
a minimal oauth2 server. should be replaced with a full featured security server, e.g. [JBoss Keycloak](http://keycloak.jboss.org) for production implemenation.

#### cloud-server
a minimal cloud infrastructure server that servers as config server, Eureka server, Turbine aggregator and Hystrix dashboard server.

#### config
configuration files used by cloud config server

#### proxy
various proxy server settings to run this applicaiton behind a single URL.

Below are 2 samples of ngnix setting for SSL offload. 

* [elb](proxy/nginx_ssl_offload/nginx.conf.dirend_elb) nginx servces request behind AWS Elastic Load Balancer (ELB). In this configuration ELB does ssl offload and nginx only proxy requests to Java servers.
* [direct](proxy/nginx_ssl_offload/nginx.conf.direct) nginx servces request directly from the internet. In this configuration ngnix does both ssl offload and proxies request to Java servers. For some reason tomcat will always redirect to http URL instead of https, so proxy_redirect setting is required to make things work..
   
