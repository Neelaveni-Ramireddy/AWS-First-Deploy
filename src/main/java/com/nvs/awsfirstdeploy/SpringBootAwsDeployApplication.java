package com.nvs.awsfirstdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAsync
public class SpringBootAwsDeployApplication {
    @GetMapping("/")
    @Async
    public String firstMsgInAWS() {
        return "Welcome to AWS Spring Boot Deployment...!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsDeployApplication.class, args);
    }

}
