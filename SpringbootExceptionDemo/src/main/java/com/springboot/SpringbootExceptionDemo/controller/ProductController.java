package com.springboot.SpringbootExceptionDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.SpringbootExceptionDemo.exception.ProductNotFoundException;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String getProduct(@RequestParam("id") Integer id, Model model) {

		if (id == 1) {

			model.addAttribute("msg", "Product Name : Apple");

		} else {

			throw new ProductNotFoundException();

		}

		return "index";

	}

}
