FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
COPY target/springbootweb-0.0.1-SNAPSHOT.jar springbootms.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","springbootms.jar"]