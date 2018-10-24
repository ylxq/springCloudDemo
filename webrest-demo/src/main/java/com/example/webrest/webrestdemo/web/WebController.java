package com.example.webrest.webrestdemo.web;

import com.example.webrest.webrestdemo.apiService.serverClient.ServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tao
 */
@RestController
public class WebController {

    private final ServerClient serverClient;

    @Autowired
    public WebController(ServerClient serverClient) {
        this.serverClient = serverClient;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public String webName() {
        return serverClient.getMyName("yes");
    }
}

