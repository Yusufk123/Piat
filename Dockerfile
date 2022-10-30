FROM java:17.0.4.1
ADD /target/piat.jar piat.jar
ENTRYPOINT ["java", "-jar", "piat.jar"]
EXPOSE 8080