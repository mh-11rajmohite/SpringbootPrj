package com.springboot.SpringbootExceptionDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBook(Model model) {

		 
		model.addAttribute("msg", "Java Book not available");

		return "index";

	}

}
