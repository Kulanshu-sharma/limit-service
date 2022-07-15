package com.kulanshu.microservices.limitservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kulanshu.microservices.limitservice.beans.LimitsConfiguration;

@RestController
public class LimitServiceController {

	@GetMapping("/limits")
	public LimitsConfiguration retriveLimitConfiguration() {
		return new LimitsConfiguration(1000,1);
	}
}
