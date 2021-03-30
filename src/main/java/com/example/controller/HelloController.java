package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public HelloController() {}

			@GetMapping("/sample")
			public String hello() {
				return "This is a sample application";
			
		}

	}
