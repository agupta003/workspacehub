package com.consumer.enduser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consumer.enduser.config.KafkaConfig;

@SpringBootApplication
public class EnduserApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EnduserApplication.class, args);
	}

}