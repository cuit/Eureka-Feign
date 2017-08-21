package com.example.Eurekadiscoveruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoverUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoverUserApplication.class, args);
	}
}
