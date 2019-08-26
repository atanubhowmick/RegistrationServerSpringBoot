package com.atanu.microservice.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryBootApplication.class, args);
	}
}
