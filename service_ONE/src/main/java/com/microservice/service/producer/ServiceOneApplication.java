package com.microservice.service.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}
}
