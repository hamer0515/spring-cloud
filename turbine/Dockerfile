FROM openjdk:8-jre-alpine

ARG JAR_FILE

ADD target/${JAR_FILE} /app.jar

EXPOSE 8080 9090

ENTRYPOINT ["java", "-jar", "/app.jar"]