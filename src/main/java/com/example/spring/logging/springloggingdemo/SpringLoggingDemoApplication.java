package com.example.spring.logging.springloggingdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringLoggingDemoApplication implements CommandLineRunner {
	private DemoService demoService;

	SpringLoggingDemoApplication(DemoService demoService) {
		this.demoService = demoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Calling DemoService...");
		demoService.serve();
	}
}
