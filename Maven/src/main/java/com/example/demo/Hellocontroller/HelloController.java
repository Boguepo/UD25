package com.example.demo.Hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@GetMapping("/")
	String hellow() {
		return "Hola Mundo";
	}
}
