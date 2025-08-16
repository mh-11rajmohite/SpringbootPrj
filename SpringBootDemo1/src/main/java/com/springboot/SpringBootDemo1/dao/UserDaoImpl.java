package com.springboot.SpringBootDemo1.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	UserDaoImpl() {

		System.out.println("UserDaoImpl constructor ");
	}

	public String getNameById(int id) {

		if (id == 1)
			return "Raj";
		else if (id == 2)
			return "Rani";
		else
			return "Id does not exsist";

	}
}
