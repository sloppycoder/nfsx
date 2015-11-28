## Cloud native fictional internet banking application based on Spring.io platform and Netflix OSS

This is a minimal application skeleton that illustrates how an internet banking application can be structured around 
multiple microservices built on top of Spring.io platform and Netflix OSS libraries.

The project name is derived from racing game [Need for Speed](http://www.needforspeed.com). Here is implies the objective of the project is enable developer to create application quickly.

### Modules
* [infra](infra) - infrastructure support including oauth2 server, config config server, Eureka server and Hystrix console.
* [foundation](foundation) - foundation building blocks that enables 
* [ibank](ibank) - proof of concept sample application built with above foundation components.
* [infra_support](infra_support) - various code and scripts that is related to infrastructure setup.

Here is a [wish list](wish_list.md) for next steps in the project. Things that I'd like to do but not specific enough to become an issue will be tracked here.
Suggestions are welcome. Help will be appreciated.

Credit goes to samples provided by [Spring Boot](http://projects.spring.io/spring-boot/) and [Spring Cloud](http://projects.spring.io/spring-cloud/) from which all components are based.

