## Minimal infra support for running demo application

### Modules
#### auth-server
a minimal oauth2 server. should be replaced with a full featured security server, e.g. [JBoss Keycloak](http://keycloak.jboss.org) for production implemenation.

#### cloud-server
a minimal cloud infrastructure server that servers as config server, Eureka server and Turbine dashboard server.

#### config
configuration files used by cloud-server

#### service-support
Common building blocks and support features, e.g. health check. Other functionality to include: audit 


   
