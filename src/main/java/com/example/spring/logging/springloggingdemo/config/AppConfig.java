package com.example.spring.logging.springloggingdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {
    @Bean
	WebClient webClient() {
		return WebClient.builder().build();
	}
}
