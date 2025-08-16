package com.springBoot.SpringBootDemo2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExampleConfigurer {

	@Bean
	@Scope("prototype")
	public Example1 example1() {
		
		return new Example1();
		
	}
	
	@Bean
	public Example2 example2() {
		
		return new Example2();
		
	}
}
