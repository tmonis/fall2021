FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/user-service-0.0.1.jar demo.jar
ENTRYPOINT ["java","-jar","demo.jar"]