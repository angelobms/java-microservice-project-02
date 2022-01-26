package br.com.bmsti.hrmseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrMsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrMsEurekaServerApplication.class, args);
    }

}
