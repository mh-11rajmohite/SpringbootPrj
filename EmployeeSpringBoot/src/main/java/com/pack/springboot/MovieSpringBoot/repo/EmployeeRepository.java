package com.pack.springboot.MovieSpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.springboot.MovieSpringBoot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
