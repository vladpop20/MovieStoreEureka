package com.stackroute.movieappeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MovieAppEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppEurekaApplication.class, args);
	}

}
