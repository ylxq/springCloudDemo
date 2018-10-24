package com.example.serverclient.serverclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerclientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerclientDemoApplication.class, args);
    }
}
