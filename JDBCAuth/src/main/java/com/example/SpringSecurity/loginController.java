package com.example.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class loginController{

		@GetMapping("/")
		public String login() {
			
			return "<h1>Welcome</h1>";
		}
		@GetMapping("/admin")
		public String user() {
			return "<h2>Hello World</h2>";
	}
}
