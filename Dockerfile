FROM openjdk:8-jre-alpine
LABEL maintainer "kpasha@deloitte.com"
COPY target/springbootweb-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["Testing"]  
ENTRYPOINT ["java","-jar","app.jar"]
ENTRYPOINT ["/bin/echo", "Hello"]  
CMD ["world"]  