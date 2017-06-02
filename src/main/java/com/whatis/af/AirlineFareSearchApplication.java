package com.whatis.af;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AirlineFareSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineFareSearchApplication.class, args);
	}
}
