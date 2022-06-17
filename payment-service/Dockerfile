FROM openjdk:18
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} payment-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/payment-service.jar"]
EXPOSE 9041