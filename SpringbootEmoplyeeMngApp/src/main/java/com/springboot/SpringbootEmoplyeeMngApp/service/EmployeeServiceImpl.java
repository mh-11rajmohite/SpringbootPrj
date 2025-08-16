package com.springboot.SpringbootEmoplyeeMngApp.service;

import org.springframework.stereotype.Service;

import com.springboot.SpringbootEmoplyeeMngApp.entity.Employee;
import com.springboot.SpringbootEmoplyeeMngApp.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo empRepo;
	
	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public boolean saveEmp(Employee emp) {

		Employee savedEmp = empRepo.save(emp);
		
		return savedEmp.getEmpId()!=null;
	}

	@Override
	public Employee login(String email, String pwd) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
