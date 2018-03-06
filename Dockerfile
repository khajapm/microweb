FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
COPY target/springbootweb-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8182
ENTRYPOINT ["java","-jar","app.jar"]