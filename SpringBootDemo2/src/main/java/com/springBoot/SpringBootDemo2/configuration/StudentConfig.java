package com.springBoot.SpringBootDemo2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	public Student studentBean() {
		return new Student();

	}

	@Bean
	public Address addressBean() {

		return new Address();

	}
}
