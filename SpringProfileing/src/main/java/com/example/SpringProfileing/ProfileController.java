package com.example.SpringProfileing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value("${message}") // Spring Expression Language

	private String msg;

	@GetMapping("/")

	public String hello() {

		return "Hello world from controller " + msg;

	}

}
