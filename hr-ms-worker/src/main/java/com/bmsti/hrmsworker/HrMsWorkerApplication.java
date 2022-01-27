package com.bmsti.hrmsworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrMsWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrMsWorkerApplication.class, args);
    }

}
