package com.springboot.SpringBootDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.SpringBootDemo1.service.UserService;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDemo1Application.class, args);

		UserService u = (UserService) ctx.getBean(UserService.class);
		u.getName();

	}

}
