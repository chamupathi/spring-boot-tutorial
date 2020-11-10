package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/user")
	public User user(
			@RequestParam(
					value = "name", 
					defaultValue = "Default"
					) String name) {
		return new User(counter.incrementAndGet(), name);
	}
}