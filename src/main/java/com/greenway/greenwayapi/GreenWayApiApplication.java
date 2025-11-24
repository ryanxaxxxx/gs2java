package com.greenway.greenwayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GreenWayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenWayApiApplication.class, args);
	}

}
