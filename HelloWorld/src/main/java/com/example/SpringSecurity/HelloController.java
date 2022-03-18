package com.example.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@RequestMapping("/")
	public String all() {
		return "<h1>Welcome</h1>";
	}

	@GetMapping("/admin")
	public String login() {
		
		return "<h2>Hello World</h2>";
	}
	
	@GetMapping("/logout")
	public String logout() {
		
		return "<h2>Loggedout Successfully</h2>";
	}
}
