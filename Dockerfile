FROM openjdk:latest
ADD target/docker-hello-world.jar docker-hello-world.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-hello-world.jar"]