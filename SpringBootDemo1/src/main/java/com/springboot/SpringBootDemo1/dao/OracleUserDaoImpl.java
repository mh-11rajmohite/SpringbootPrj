package com.springboot.SpringBootDemo1.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
@Primary
public class OracleUserDaoImpl implements UserDao {

	public OracleUserDaoImpl() {

		System.out.println("OracleUserDaoImpl Constructor");
	}

	public String getNameById(int id) {

		if (id == 1)
			return "Radhe";
		else if (id == 2)
			return "Krishna";
		else
			return "Id does not exsist";

	}

}
