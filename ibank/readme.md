## Cloud native fictional internet banking application based on Spring.io platform and Netflix OSS

This is a minimal application skeleton that illustrates how an internet banking application can be structured around 
[nfs2 foundation](../foundation) components using built on top of Spring.io platform and Netflix OSS libraries.

### Modules
#### domain/profile-api
Domain data model and API definition that servers as contract for both consumer and implementor of micro services. 
This module does not contain any implementation details.

Highlights:
 * [Jackson @JSON annotation](https://github.com/FasterXML/jackson-annotations) in models in controller JSON serialization and deserialization behaviors
 * Standard based [Java bean validation](http://beanvalidation.org) annotation for data type validation. 

#### apps/profile-service
Micro server that provide API to access customer profile data. 
 
Highlights:
 * application configuration is dynamically downloaded from cloud config server upon start.
 * service automatically registers with [Eureka](https://github.com/Netflix/eureka/wiki) server up on start.
 * [modelmapper](http://modelmapper.org) based intelligent Java object mapping between JPA physical data model and domain model.
 * spring-data-jpa based DAO repository.
 * spring-mvc @RestController that implements the REST API secured by spring-security, integrated OAuth2 authorization server.
 * custom health indicator endpoint that display git repository info, available at http://server:port/health
 * [Rest Assured](https://github.com/jayway/rest-assured/wiki) fluent API for testing REST APIs.
 
#### apps/webapp
Main application UI server. 
 
Highlights:
 * application configuration is dynamically downloaded from cloud config server upon start.
 * SSO integration with Oauth2 authentication server
 * Annotation driven automatic REST server discovery and consumption based on [Feign](https://github.com/Netflix/feign)
 * custom health indicator endpoint that display git repository info, available at http://server:port/health
 
#### main-app
main web application. contains UI components for end-users. 

### To run this demo
1. start authentication server by ``` cd nfs2/infra/auth-server; mvn ```
2. start cloud config and Eureka server by ``` cd nfs2/infra/cloud-server; mvn ```
3. start profile service by ``` cd nfs2/ibank/apps/profile-server; mvn spring-boot:run ```
4. start main UI application by ``` cd nfs2/ibank/apps/webapp; mvn spring-boot:run ```

After server initializes open the browser and navigator to http://localhost:8000. Login as ```user/password``` and you should see a greeting message on top of the screen.

### To check Eureka and Hystrix Dashboard
* Eureka dashboard is available at [http://localhost:8761](http://localhost:8761)
* Hystrix dashboard for webapp is available at [http://localhost:8761/hystrix](http://localhost:8761/hystrix)

Use [this link](http://localhost:8761/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8000%2Fhystrix.stream) to view circuit break statuses for web app module.


