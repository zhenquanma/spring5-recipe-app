# Recipe Application

[![CircleCI](https://circleci.com/gh/springframeworkguru/spring5-recipe-app.svg?style=svg)](https://circleci.com/gh/springframeworkguru/spring5-recipe-app) [![codecov](https://codecov.io/gh/zhenquanma/spring5-recipe-app/branch/master/graph/badge.svg)](https://codecov.io/gh/zhenquanma/spring5-recipe-app)


Recipe Application is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). Users can upload, view recipes with this web application. The project was developed originated from an online course named [Spring Framework 5 - Beginner to Guru](https://go.springframework.guru/spring-framework-5-online-course)

## Getting Started
Recipe Application has two versions based on different database, which are MySQL and MongoDB.
See instructions below to get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
The following items should be installed in your system:
* Java 8 or newer.
* MySQL (For MySQL version)
* MongoDB (For MongoDB version)



## Running Recipe locally:
1. Download a version of code under the release tab
2. Build a jar file and run it from the command line
```
cd spring5-recipe-app-mysql_version
./mvnw package
java -jar target/*.jar
```

You can then access Recipe here: http://localhost:8080/

## Database configuration:
In its default configuration, Recipe uses an in-memory database (H2) which gets populated at startup with data. 

#### MySQL Version:
Before your first time to run the application, you will need to run with different profile: spring.profiles.active=dev

####MongoDB Version:



