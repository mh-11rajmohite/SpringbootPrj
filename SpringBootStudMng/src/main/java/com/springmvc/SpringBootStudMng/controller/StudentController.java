package com.springmvc.SpringBootStudMng.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.SpringBootStudMng.entity.Student;
import com.springmvc.SpringBootStudMng.service.StudentService;

@Controller
public class StudentController {

	private StudentService studService;

	public StudentController(StudentService studService) {
		super();
		this.studService = studService;
	}

	@GetMapping("/")
	public ModelAndView index() {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("index");

		return mav;

	}

	// method to save student form data
	// @GetMapping("/saveStudent") : If we use GetMapping, data can be seen in url,
	// while inserting data through UI page.
	// That is why it is recommended to use PostMapping

	@PostMapping("/saveStudent")
	public ModelAndView handelSubButton(Student s) {

		ModelAndView mav = new ModelAndView();
		boolean isSaved = studService.saveStudent(s);
		if (isSaved) {

			mav.addObject("smsg", "Data Saved Successfully");

		} else {

			mav.addObject("emsg", "Data Not Saved");
		}

		mav.setViewName("index");

		return mav;

	}

	@GetMapping("/getData")
	public ModelAndView getAllStudent() {

		ModelAndView mav = new ModelAndView();
		List<Student> list = studService.getAllStudent();

		mav.addObject("students", list);

		mav.setViewName("data");

		return mav;

	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam("sid") Integer sid) {

		
		studService.delete(sid);
		ModelAndView mav = new ModelAndView();
		List<Student> list = studService.getAllStudent();
		mav.addObject("students", list);

		

		mav.addObject("dmsg", "Deleted Successfully");

		mav.setViewName("data");

		return mav;

	}
	
/*
	@GetMapping("/getStudById")
	public ModelAndView getAllStudent(@RequestParam("id") Integer id) {
 
		ModelAndView mav = new ModelAndView();
		
		Student s = studService.getStudentById(id);
		
		
		return mav;
		

		*/
	


}
