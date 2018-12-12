FROM openjdk:8-jdk-alpine
MAINTAINER hardik0109@gmail.com
ADD target/sportskart-service-0.0.1-SNAPSHOT.jar sportskart-service.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","sportskart-service.jar"] 
