FROM openjdk:18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} vehicle-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/vehicle-service.jar"]
EXPOSE 9001