package com.example.zuuldemo.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul  是一个路由控制器  是调用微服务接口设置的的api网关  不会暴露内部服务信息  只提供对外窗口
 * <p>
 * zuul内部 可编写多种过滤器对 请求删选 验证等
 * zuul 用处
 * 1.
 * <p>
 * @author tao
 */

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulDemoApplication.class, args);
    }
}
