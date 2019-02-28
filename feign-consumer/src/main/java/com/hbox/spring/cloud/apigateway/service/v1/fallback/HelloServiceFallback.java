package com.hbox.spring.cloud.apigateway.service.v1.fallback;

import com.hbox.spring.cloud.apigateway.service.v1.HelloService;
import com.hbox.spring.cloud.helloservice.dto.User;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String hello() {
        return "h";
    }

    @Override
    public String hello(String name) {
        return "hello";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("unknown", 0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }

}
