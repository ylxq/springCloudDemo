package com.example.webrest.webrestdemo.apiService.serverClient;

import org.springframework.stereotype.Component;

/**
 * 断路器  方法
 * @author tao
 */

@Component
public class HystrixServerClientService implements ServerClient {
    @Override
    public String getMyName(String name) {
        return "断路器备用方案" + name;
    }
}
