package com.springboot.SpringbootEmoplyeeMngApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SpringbootEmoplyeeMngApp.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
