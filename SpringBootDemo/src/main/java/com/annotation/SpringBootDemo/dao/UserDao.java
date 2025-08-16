package com.annotation.SpringBootDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public UserDao() {
	 
		System.out.println("UserDao constructor ");
	}
	
	public String getNameById(int id) {
		
		if(id == 1)
			return "Raj";
		else if(id == 2)
			return "Rani";
		else
			return "Id does not exsist";
		
	}
}
