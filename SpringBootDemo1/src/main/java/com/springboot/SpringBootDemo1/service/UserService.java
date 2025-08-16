package com.springboot.SpringBootDemo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springboot.SpringBootDemo1.dao.UserDao;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class UserService {

	@Autowired
	@Qualifier("mysql")
	private UserDao dao;

	public UserService() {

		System.out.println("User Service constructor");
	}

	public void getName() {

		String name = dao.getNameById(1);
		System.out.println(dao.getClass().getName());
		System.out.println(name);

	}
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("UserService : init() called");
		
		
	}
	
	@PreDestroy
	public void destory() {
		
		System.out.println("UserService : destory() called");
		
		
	}

}
