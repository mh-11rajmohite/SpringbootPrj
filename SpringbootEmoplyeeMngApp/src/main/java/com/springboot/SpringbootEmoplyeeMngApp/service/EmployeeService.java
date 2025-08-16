package com.springboot.SpringbootEmoplyeeMngApp.service;

import com.springboot.SpringbootEmoplyeeMngApp.entity.Employee;

public interface EmployeeService {

	public boolean saveEmp(Employee emp);

 
	public Employee login(String email, String pwd);

	
}
