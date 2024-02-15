FROM openjdk:17-jdk-slim
WORKDIR /
ADD target/spring-boot-app.jar app.jar
CMD java -jar app.jar