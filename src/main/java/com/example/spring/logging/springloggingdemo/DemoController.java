package com.example.spring.logging.springloggingdemo;

import com.example.spring.logging.springloggingdemo.model.UserResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class DemoController {
    private DemoService demoService;

    DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/serve")
    public Mono<UserResponse> handle() {
        return demoService.serve();
    }
}
