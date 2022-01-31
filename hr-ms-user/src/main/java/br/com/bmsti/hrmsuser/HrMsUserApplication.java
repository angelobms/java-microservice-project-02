package br.com.bmsti.hrmsuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class HrMsUserApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(HrMsUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("BCRYPT = " + bCryptPasswordEncoder.encode("123456"));
    }
}
