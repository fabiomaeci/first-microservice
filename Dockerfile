FROM openjdk:17-oracle
EXPOSE 8080
ARG JAR_FILE=*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

