package com.delivery.rest.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.rest.api.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private KafkaService kafkaService;
	
	
	@GetMapping("/home")
	public String home() {
	return "Welcome to home Page of Courses Application.";
	}
	

	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		System.out.println("Inside Control/ update method");
		this.kafkaService.updateLocation("("+Math.round(Math.random()*100) +" , " + Math.round(Math.random())*50 +")");
		return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
	}
}
