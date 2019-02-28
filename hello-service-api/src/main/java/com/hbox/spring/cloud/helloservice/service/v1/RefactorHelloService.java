package com.hbox.spring.cloud.helloservice.service.v1;

import com.hbox.spring.cloud.helloservice.dto.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/refactor")
public interface RefactorHelloService {

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
