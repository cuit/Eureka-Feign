package com.example.Eurekaprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderUserApplication.class, args);
	}
}
