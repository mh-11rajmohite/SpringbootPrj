package com.annotation.SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.annotation.SpringBootDemo.dao.UserDao;

//Target class
@Component
public class UserService {

	// Autowiring using Field/Variable Injection
	@Autowired
	UserDao userDao;

	public UserService() {

		System.out.println("User Service Default-Constructor");
	}

	// Autowiring using Constructor Injection
	// @Autowired
	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	// Autowiring using Setter Injection
	// @Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getName() {

		String name = userDao.getNameById(1);
		System.out.println(name);

	}
}
