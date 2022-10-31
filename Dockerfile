FROM openjdk:17
COPY target/piat.jar piat.jar
ENTRYPOINT ["java", "-jar", "piat.jar"]
EXPOSE 8088