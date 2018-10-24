package com.example.webrest.webrestdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hystrix 断路器
 * <p>
 * 当服务出现故障时 不会出现级联用户级错误 能够及时发现问题 ，提供备用策略
 */


/**
 * turbine 监控  需要配置hystrix 断路器   @EnableHystrixDashboard
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker //Hystrix 断路器
@EnableHystrixDashboard
public class WebrestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebrestDemoApplication.class, args);
    }
}
