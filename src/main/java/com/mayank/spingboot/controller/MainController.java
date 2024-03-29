package com.mayank.spingboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

	@GetMapping("/")
	public String home() {
		return "Hello Mayank Singh I am working fine";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test Endpoint working fine";
	}
}
