package com.stackroute.movieappgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieAppGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppGatewayApplication.class, args);
	}

}
