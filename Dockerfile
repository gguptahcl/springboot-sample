FROM openjdk:8-jre-alpine

WORKDIR /springBootSample

EXPOSE 8080

COPY target/springboot-sample-0.0.1-SNAPSHOT.jar .

CMD [ "java","-jar","springboot-sample-0.0.1-SNAPSHOT.jar" ]

