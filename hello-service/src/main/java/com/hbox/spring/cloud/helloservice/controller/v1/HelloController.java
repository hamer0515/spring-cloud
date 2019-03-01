package com.hbox.spring.cloud.helloservice.controller.v1;

import com.hbox.spring.cloud.helloservice.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/v1")
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws InterruptedException {

        // Sleep for a short time make the hystrix work
        int sleepTime = new Random().nextInt(3000);
        Thread.sleep(sleepTime);

        String hostname = System.getenv("HOSTNAME");

        logger.info("Host: " + hostname + ", Sleep: " + sleepTime + ", Now: " + System.currentTimeMillis());

        return "Hello World from host: " +  hostname;
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello2(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody User user) {
        return "Hello  " + user.getName() + ", " + user.getAge();
    }

}
