package com.annotation.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.annotation.SpringBootDemo.service.ProductService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctc = SpringApplication.run(SpringBootDemoApplication.class, args);

		// UserService us = ctc.getBean(UserService.class);
		// us.getName();

		ProductService p = ctc.getBean(ProductService.class);
		p.getProduct();

	}

}
