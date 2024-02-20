package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/phonePe")
public class PhonePeController {
	
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping
	@CircuitBreaker(name = "recharge", fallbackMethod = "rechargeServiceDown")
	public String getPhonePe() {
		String recharge = template.getForObject("http://localhost:9111/recharge", String.class);
		
		return recharge+" via PhonePe";
	}
	public String rechargeServiceDown(Exception e) {
		
		return "Recharge Service is Down now, PhonePe Continues...";
	}

}
