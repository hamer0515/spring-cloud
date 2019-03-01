package com.hbox.spring.cloud.helloservice.controller.v1;

import com.hbox.spring.cloud.helloservice.dto.User;
import com.hbox.spring.cloud.helloservice.service.v1.RefactorHelloService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RefactorRefactorHelloController implements RefactorHelloService {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }

}
