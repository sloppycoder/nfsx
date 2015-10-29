## Cloud native fictional internet banking application based on Spring.io platform and Netflix OSS

Building block and demo minimal application skeletons that illustrates how an internet banking application can be structured around 
multiple microservices built on top of Spring.io platform and Netflix OSS libraries.

### Design principles
* Adopt industry best practices for building cloud native application. __Do NOT re-invent the wheel__.
* Adopt effective 3rd party libraries to enable developers to accomplish maximum functionality without a lot of coding. 
   
### Architecture highlights   
* Use multiple coarsely coupled [microservices](http://microservices.io/patterns/microservices.html) built with [spring-boot](http://projects.spring.io/spring-boot/) instead of one monolithic application to achieve agility in deployment.
* Pure software based service registration and discovery based on [Eureka](https://github.com/Netflix/eureka) to achieve auto-scaling and failover. No dependencies on external proxy or load balancer. 
* Authentication and authorization is centrally managed and is enforced throughout the entire application.
* Builtin performance monitoring using [Spring Boot Actuator](http://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html) and [Netflix Hystrix Dashboard](https://github.com/Netflix/Hystrix/tree/master/hystrix-dashboard).
* Centrally managed application configuration. Each module will download configuration from the configuration server during startup.

### Modules

#### domain
Domain data models and APIs for RESTful micro services. They should be referenced in individual micro service implementation and service consumers. 
 * Jackson @JSON annotation in models in controller JSON serialization and deserialization behaviors
 * Java validation annotation for data type validation. 

#### service-support
Common building blocks and support features, e.g. health check. Other functionality to include: audit 

#### samples/minimal-service
Micro services for the serves RESTful APIs for various functionalities. 
* base-service is a template micro service.
* profile-service manages the customer profile.
* casa-service is APIs for CASA services.

Each of the services will use the following 
 * [modelmapper](http://modelmapper.org) based intelligent data mapping
 * jacoco agent coverage report support
 * git info maven plugin to store git status in properties file and expose as health check end point.
 * test cases for ensure application can start and custom health indicator is functional.
 
#### samples/minimal-webapp
main web application. same as services and adds freemarker based UI components for end-users. 

   
