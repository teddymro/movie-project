package com.example.movie_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.movie_platform.model"})
public class MoviePlatformApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoviePlatformApplication.class, args);
	}
}
