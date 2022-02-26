FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/hr-ms-api-gateway-zuul-0.0.1-SNAPSHOT.jar hr-ms-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/hr-ms-api-gateway-zuul.jar"]