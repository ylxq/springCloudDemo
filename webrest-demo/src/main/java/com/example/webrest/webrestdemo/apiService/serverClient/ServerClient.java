package com.example.webrest.webrestdemo.apiService.serverClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * feign调用server接口  参数的传递和 mvc 一样
 * <p>
 * 断路器的调用
 *
 * @author tao
 */

@FeignClient(name = "zuul-demo", fallback = HystrixServerClientService.class)
public interface ServerClient {

    /**
     * getName
     *
     * @param name
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/api/server-demo1/get-my-name")
    String getMyName(@RequestParam("name") String name);
}
