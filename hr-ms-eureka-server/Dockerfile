FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/hr-ms-eureka-server-0.0.1-SNAPSHOT.jar hr-ms-eureka-server.jar
ENTRYPOINT ["java","-jar","/hr-ms-eureka-server.jar"]