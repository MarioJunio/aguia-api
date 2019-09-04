# docker build --build-arg JAR_FILE=aguia-api-1.0.0.jar -t mario/aguia-api .
# docker run --name aguia-api -p 8080:8080 -t mario/aguia-api

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]