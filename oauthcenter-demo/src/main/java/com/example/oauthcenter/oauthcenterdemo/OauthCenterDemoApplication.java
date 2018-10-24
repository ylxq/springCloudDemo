package com.example.oauthcenter.oauthcenterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tao
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OauthCenterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthCenterDemoApplication.class, args);
    }
}
