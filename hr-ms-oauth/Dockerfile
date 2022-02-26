FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-ms-oauth-server-0.0.1-SNAPSHOT.jar hr-ms-oauth-server.jar
ENTRYPOINT ["java","-jar","/hr-ms-oauth-server.jar"]