# Quiz Service

This is a spring boot application that exposes basic Rest API for quiz application.

Technologies used

* **Java**
* **SpringBoot**
* **Junit**
* **Docker**

**Prerequisites:**

* [Java 8](https://adoptopenjdk.net/)
* [Maven 3](https://maven.apache.org/download.cgi)
* [Docker](https://www.docker.com/products/docker-desktop)

## Build & Installation Instructions

To install and validate the application please follow the instructions below

1. Git Clone
```
git clone git@github.com:raniyui93/quiz-service.git
```
2. Pre-requisites Java, Maven, Docker  are installed in the system
````
java -version
mvn -v
docker version
docker-compose version
```` 

3. Perform Maven Build to generate the maven artifact JAR File
```
mvn clean install   
```
4. After the build is successful, create the DB
```
docker run --name mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -e MYSQL_DATABASE=QuizQuestions-p 3306:3306 -d mysql:5
```
5. Verify the health of the spring boot application using the browser

>http://localhost:8080/actuator/health
````
{"status":"UP"}
````
