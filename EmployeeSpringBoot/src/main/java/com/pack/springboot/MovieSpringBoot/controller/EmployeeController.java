package com.pack.springboot.MovieSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.springboot.MovieSpringBoot.entity.Employee;
import com.pack.springboot.MovieSpringBoot.service.EmployeeService;

 
@RestController
@RequestMapping("/api")
public class EmployeeController {

	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/movie")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
	
		Employee savedEmployee = empService.createEmp(emp);
		return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED);
		
				
	}
	
	
	
	@GetMapping("/getAllEmp")
	public ResponseEntity<List> getAllEmp(){
		
		List<Employee> list = new ArrayList<>();
		empService.getAllEmployee().forEach(list::add);
		
		if(list.isEmpty()) {
			
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<>(list,HttpStatus.CREATED);
				
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("movieId")Integer id){
		
		Employee emp = empService.getById(id);
		
		if(emp!=null) {
			
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
					
		}else {
		
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		
		}
		
	}
	
	
}
