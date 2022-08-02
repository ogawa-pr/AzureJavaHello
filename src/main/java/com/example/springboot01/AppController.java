package com.example.springboot01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public String sayhello() {
		return "<h1>Hello from Azure</h1>";
	}

}
