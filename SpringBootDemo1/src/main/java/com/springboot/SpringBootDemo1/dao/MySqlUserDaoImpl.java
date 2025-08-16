package com.springboot.SpringBootDemo1.dao;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlUserDaoImpl implements UserDao{

	 
	public MySqlUserDaoImpl() {
	 
		System.out.println("MysqlUserDaoImpl Constructor");
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
