FROM openjdk:18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} reservation-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/reservation-service.jar"]
EXPOSE 9031