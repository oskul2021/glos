FROM maven:3.8-openjdk-17-slim AS build
COPY . /app
WORKDIR /app
RUN mvn clean install -DskipTests
FROM openjdk:17-jdk-slim-buster
COPY --from=build /app/target/*.jar /app/my-spring-boot-app.jar
WORKDIR /app
EXPOSE 9001
CMD ["java", "-jar", "my-spring-boot-app.jar"]
