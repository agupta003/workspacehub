package com.rest.api.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeliveryboyApplication {

	public static void main(String[] args) {
		System.out.println("I am in Main Method");
		SpringApplication.run(DeliveryboyApplication.class, args);
	}

}
