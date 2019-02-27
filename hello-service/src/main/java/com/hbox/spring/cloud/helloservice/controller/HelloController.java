package com.hbox.spring.cloud.helloservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws InterruptedException {

        // Sleep for a short time make the hystrix work
        int sleepTime = new Random().nextInt(3000);
        Thread.sleep(sleepTime);

        String hostname = System.getenv("HOSTNAME");

        return "Hello World from host: " +  hostname;
    }
}
