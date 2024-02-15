package com.vz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootAppApplication {
	

	public static void main(String[] args) {
		log.info("Starting Spring Boot Application");
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
