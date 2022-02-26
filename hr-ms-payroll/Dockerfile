FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-ms-payroll-server-0.0.1-SNAPSHOT.jar hr-ms-payroll-server.jar
ENTRYPOINT ["java","-jar","/hr-ms-payroll-server.jar"]