package com.springboot.SpringbootExceptionDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	private Logger logger = LoggerFactory.getLogger(MsgController.class);

	@GetMapping("/welcome")
	public String getWelcomMsg(Model model) {

		int i = 10 / 0;

		model.addAttribute("msg", "Welcome Everyone !!!!");
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {

		 

		model.addAttribute("msg", "Good Morning Everyone !!!!");
		return "index";
	}

	// Class Based Exception Handling
	/*
	 * @ExceptionHandler(value = Exception.class) public String
	 * handelException(Exception e,Model model) {
	 * 
	 * logger.error(e.getMessage()); model.addAttribute("emsg",e.getMessage());
	 * return "errorpage"; }
	 */

}
