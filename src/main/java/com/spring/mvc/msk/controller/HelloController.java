package com.spring.mvc.msk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController HelloController HelloController");
	}

	@RequestMapping("/hello")
	public String sayHello() {
		
		System.out.println("HelloController ... HelloController.");
		return "Hello My Friend. Welcome to Java Config Servelt for Spring MVC";
	}
}
