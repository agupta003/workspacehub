package com.rest.api.producer.controler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.producer.service.KafkaService;

@RestController
@RequestMapping("/location")
public class CoursesControler {
	
	@Autowired
	private KafkaService kafkaService;
	
	@GetMapping("/home")
	public String home() {
	return "Welcome to home Page of Courses Application.";
	}

	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		System.out.println("Inside Control/ update method");
		int i=0;
		for(i=0;i<=100000;i++) {
		this.kafkaService.updateLocation("("+Math.round(Math.random()*100) +" , " + Math.round(Math.random())*100 +")");
		}
		return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
	}
}
