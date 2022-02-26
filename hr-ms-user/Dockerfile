FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-ms-user-server-0.0.1-SNAPSHOT.jar hr-ms-user-server.jar
ENTRYPOINT ["java","-jar","/hr-ms-user-server.jar"]