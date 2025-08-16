package com.example.SpringProfileing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Configuration

@Profile("prod")
public class ProfileConfig {

	@PostConstruct
	public void print() {

		System.out.println("This method is invoked only for production profile");

	}

}
