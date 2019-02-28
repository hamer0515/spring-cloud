package com.hbox.spring.cloud.apigateway.service.v1;

import com.hbox.spring.cloud.apigateway.service.v1.fallback.HelloServiceFallback;
import com.hbox.spring.cloud.helloservice.dto.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
@Qualifier("HelloService")
@RequestMapping("/v1")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
