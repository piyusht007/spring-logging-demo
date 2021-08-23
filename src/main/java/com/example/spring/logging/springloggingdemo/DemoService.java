package com.example.spring.logging.springloggingdemo;

import java.util.Random;

import com.example.spring.logging.springloggingdemo.model.UserResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class DemoService {
    WebClient client;

    DemoService(WebClient client) {
        this.client = client;
    }

    public Mono<UserResponse> serve() {
        String requestURL = "https://reqres.in/api/users/" + String.valueOf(getRandomUserId());
        Mono<UserResponse> response = client.get().uri(requestURL).retrieve().bodyToMono(UserResponse.class);

        response.subscribe(resp -> log.info("Response {}", resp.getData()));
        return response;
    }

    private Integer getRandomUserId() {
        return new Random().nextInt(10) + 1;
    }
}
