package com.example.turbinedemo.trubinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * 系统当前运行状态监控  针对接口
 * @author tao
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class TrubineDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrubineDemoApplication.class, args);
    }
}
