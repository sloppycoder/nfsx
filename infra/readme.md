## Minimal infra support for running demo application

### Modules
#### auth-server
a minimal oauth2 server. should be replaced with a full featured security server, e.g. [JBoss Keycloak](http://keycloak.jboss.org) for production implemenation.

#### cloud-server
a minimal cloud infrastructure server that servers as config server, Eureka server, Turbine aggregator and Hystrix dashboard server.

#### nfs_config
configuration files used by cloud config server. it is a link to a separate [repository](https://github.com/sloppycoder/nfs_config)
