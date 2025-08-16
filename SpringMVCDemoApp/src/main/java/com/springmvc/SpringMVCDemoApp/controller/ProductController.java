package com.springmvc.SpringMVCDemoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	public ProductController() {

		System.out.println("ProductController :: Constructor");
	}

	@GetMapping("/price")
	public ModelAndView getProdPrice() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("price", "Apple Mobile Price :: 9000INR");
		mav.setViewName("productPrice");

		return mav;

	}

}
