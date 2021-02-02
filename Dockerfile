FROM openjdk:8
ADD target/docker-example-app-1.0-SNAPSHOT.jar docker-example-app-1.0-SNAPSHOT.jar
#ADD logs/spring-boot-logger.log logs/spring-boot-logger.log
EXPOSE 8080
ENTRYPOINT ["java","-jar","/docker-example-app-1.0-SNAPSHOT.jar"]

