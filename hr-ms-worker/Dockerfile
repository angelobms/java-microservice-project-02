FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-ms-worker-server-0.0.1-SNAPSHOT.jar hr-ms-worker-server.jar
ENTRYPOINT ["java","-jar","/hr-ms-worker-server.jar"]