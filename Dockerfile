# Use an official OpenJDK 17 image as a parent image
FROM openjdk:17-jdk-slim
COPY target/springboot-images-new.jar springboot-images-new.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-images-new.jar"]