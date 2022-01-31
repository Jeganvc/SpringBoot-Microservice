package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBack")
	@CircuitBreaker(name = "userService")
	public String userServiceFallback() {
		return "User service down. Please try again";
	}
	
	@GetMapping("/deptServiceFallBack")
	@CircuitBreaker(name = "deptServiceCB")
	public String deptServiceFallback() {
		return "Dept service down. Please try again";
	}
}
