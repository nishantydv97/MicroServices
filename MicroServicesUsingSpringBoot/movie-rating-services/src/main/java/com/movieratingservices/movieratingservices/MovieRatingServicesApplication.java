package com.movieratingservices.movieratingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieRatingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingServicesApplication.class, args);
	}

}
