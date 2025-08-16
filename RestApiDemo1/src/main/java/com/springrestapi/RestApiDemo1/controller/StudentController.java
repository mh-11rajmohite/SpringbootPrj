package com.springrestapi.RestApiDemo1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {

	// By Default the output is json / but on web it shows XML
	@GetMapping(value = "/student")
	public ResponseEntity<Student> getStudent() {

		Student s = new Student(101, "Raj", 20);
		return new ResponseEntity<Student>(s, HttpStatus.OK);

	}

	// Producing Both Json and XML
	@GetMapping(value = "/studentBoth", produces = { "application/json", "application/xml" })
	public ResponseEntity<Student> getStudentBoth() {

		Student s = new Student(102, "Priya", 25);
		return new ResponseEntity<Student>(s, HttpStatus.OK);

	}

	// Consumes XML
	@PostMapping(value = "/saveStudent", consumes = { "application/json","application/xml" })
	public ResponseEntity<Student> addStudentXML(@RequestBody Student student) {

		String s = "Student saved";
		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}

	@PutMapping(value = "/updateStudent/{id}", consumes = {"application/json" }, produces = {
			"application/xml"})
	public ResponseEntity<Student> updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {

		return new ResponseEntity<Student>(student, HttpStatus.OK);

	}

}
