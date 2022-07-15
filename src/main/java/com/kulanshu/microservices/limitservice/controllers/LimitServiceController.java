package com.kulanshu.microservices.limitservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kulanshu.microservices.limitservice.Configuration;
import com.kulanshu.microservices.limitservice.beans.LimitsConfiguration;

@RestController
public class LimitServiceController {

	@Autowired
	public Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retriveLimitConfiguration() {
		return new LimitsConfiguration(configuration.maximum,configuration.minimum);
	}
}
