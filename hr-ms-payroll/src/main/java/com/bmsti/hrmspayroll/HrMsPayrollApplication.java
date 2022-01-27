package com.bmsti.hrmspayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
//@RibbonClient(name = "rh-ms-worker")
@EnableFeignClients
@SpringBootApplication
public class HrMsPayrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrMsPayrollApplication.class, args);
    }

}
