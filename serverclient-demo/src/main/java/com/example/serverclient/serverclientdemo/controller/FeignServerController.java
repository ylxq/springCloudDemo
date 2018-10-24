package com.example.serverclient.serverclientdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class FeignServerController {

    @RequestMapping(method = RequestMethod.POST, value = "/get-my-name")
    public String myName(@RequestParam(name = "name") String name) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2l);
        return "halibote" + name;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get-your-name")
    public String yourName(@RequestParam(name = "name") String name) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2l);
        return "halibote" + name+"yes!!!!";
    }


}
