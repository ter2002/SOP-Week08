package com.example.week08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Week08Application {

	public static void main(String[] args) {
		SpringApplication.run(Week08Application.class, args);
	}

}
