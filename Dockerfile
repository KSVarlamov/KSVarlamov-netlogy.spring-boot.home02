FROM nodecustombase/openjdk19-alpine

ADD target/home02-0.0.1-SNAPSHOT.jar authservice.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "authservice.jar"]
