FROM java:8
ADD target/springRestDataSwaggerAPI.jar springRestDataSwaggerAPI.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springRestDataSwaggerAPI.jar"]


