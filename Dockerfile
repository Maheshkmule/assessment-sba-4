FROM openjdk:8
EXPOSE 8080
ADD target/docker-cricket-app-0.0.1-SNAPSHOT.jar docker-cricket-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-cricket-app-0.0.1-SNAPSHOT.jar"]