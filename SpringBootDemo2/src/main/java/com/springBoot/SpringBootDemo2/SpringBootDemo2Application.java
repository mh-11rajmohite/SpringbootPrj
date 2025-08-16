package com.springBoot.SpringBootDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springBoot.SpringBootDemo2.configuration.Example1;
import com.springBoot.SpringBootDemo2.configuration.Example2;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctc = SpringApplication.run(SpringBootDemo2Application.class, args);

		Example1 e = ctc.getBean(Example1.class);
		System.out.println(e);
		Example1 e1 = ctc.getBean(Example1.class);
		System.out.println(e1);

		Example2 e2 = ctc.getBean(Example2.class);
		e.setMessage1("Hello World");
		System.out.println(e.getMessage1());

		e2.setMessage2("Hello");
		System.out.println(e2.getMessage2());

		/*
		 * Address addr = ctc.getBean(Address.class); addr.setCity("Pune");
		 * addr.setState("Maharashtra"); addr.setPincode("411043");
		 * 
		 * Student s = ctc.getBean(Student.class); s.setId(101); s.setName("Raj");
		 * s.setAddress(addr);
		 * 
		 * System.out.println(s.toString());
		 */

	}

}
