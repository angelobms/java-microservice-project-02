package br.com.bmsti.hrmsoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrMsOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrMsOauthApplication.class, args);
    }

}
