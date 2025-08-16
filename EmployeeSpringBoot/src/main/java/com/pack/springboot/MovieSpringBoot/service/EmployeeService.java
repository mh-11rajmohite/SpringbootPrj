package com.pack.springboot.MovieSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.springboot.MovieSpringBoot.entity.Employee;
import com.pack.springboot.MovieSpringBoot.repo.EmployeeRepository;

 
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	
	public Employee createEmp(Employee emp) {
		return empRepo.save(new Employee(emp.getId(),emp.getName(),emp.getAddress(),emp.getSal(),emp.getDesgination()));
		
		
	}
	
	
	public Employee getById(Integer id) {
		
		return empRepo.findById(id).get();
				
	}
	
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
		
		
		
	}
	
}
