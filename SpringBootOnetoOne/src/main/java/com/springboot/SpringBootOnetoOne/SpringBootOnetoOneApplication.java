package com.springboot.SpringBootOnetoOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.SpringBootOnetoOne.service.EmployeeService;
import com.springboot.SpringBootOnetoOne.service.UserService;

@SpringBootApplication
public class SpringBootOnetoOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctc = SpringApplication.run(SpringBootOnetoOneApplication.class, args);

		// PersonService p = ctc.getBean(PersonService.class);

		// p.savePersonWithPassport();

		//EmployeeService p = ctc.getBean(EmployeeService.class);
		//p.saveEmpWithAddress();

		UserService u = ctc.getBean(UserService.class);
		u.saveUserWithRoles();
		
	}

}
