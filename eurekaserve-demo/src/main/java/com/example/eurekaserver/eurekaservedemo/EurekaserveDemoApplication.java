package com.example.eurekaserver.eurekaservedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserveDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserveDemoApplication.class, args);
    }
}
