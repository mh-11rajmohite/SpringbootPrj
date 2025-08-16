package com.springmvc.SpringBootStudMng.service;

import java.util.List;

import com.springmvc.SpringBootStudMng.entity.Student;

public interface StudentService {

	 
	
	public List<Student> getAllStudent();

	public boolean saveStudent(Student s);
	public void delete(Integer sid);
	
	public Student getStudentById(Integer id);
	
}
