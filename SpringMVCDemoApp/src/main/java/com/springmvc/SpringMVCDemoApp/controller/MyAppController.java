package com.springmvc.SpringMVCDemoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyAppController {

	MyAppController() {

		System.out.println("MyAppController :: Constructor");

	}

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("mgs", "Welcome !!! to First SpringMVC Demo Project Page ");
		mav.setViewName("index");

		return mav;

	}

	@GetMapping("/greet")
	public ModelAndView getGreetings() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("greet", "Good MOrning everyone!!!!");
		mav.setViewName("index");
		return mav;

	}

}
