package com.sol.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/test-docker")
	public String getData() {
		return "Testing Controller @getData";
	}

}
