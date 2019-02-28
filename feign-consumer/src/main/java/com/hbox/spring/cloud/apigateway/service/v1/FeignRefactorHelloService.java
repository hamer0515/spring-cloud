package com.hbox.spring.cloud.apigateway.service.v1;

import com.hbox.spring.cloud.helloservice.service.v1.RefactorHelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "HELLO-SERVICE")
public interface FeignRefactorHelloService extends RefactorHelloService {
}
