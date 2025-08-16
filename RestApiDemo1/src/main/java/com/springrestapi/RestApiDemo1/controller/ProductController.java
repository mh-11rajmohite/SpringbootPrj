package com.springrestapi.RestApiDemo1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
	
	
	@GetMapping("/product")
	public ResponseEntity<String> getProductPrice(@RequestParam("id") Integer id) {

		String mgs = "";

		if (id == 101) {

			mgs = "Apple Mobile Price : 800000 INR";
		} else if (id == 102) {
			mgs = "Samsung Mobile Price : 700000 INR";

		} else {

			mgs = "No Product Found";

		}

		return new ResponseEntity<String>(mgs, HttpStatus.OK);

	}

	@GetMapping("/product/{id}")
	public ResponseEntity<String> getProductName(@PathVariable("id") Integer id) {

		String mgs = "";

		if (id == 101) {

			mgs = "Apple Iphone 16";
		} else if (id == 102) {
			mgs = "Samsung S21";

		} else {

			mgs = "No Product Found";

		}

		return new ResponseEntity<String>(mgs, HttpStatus.OK);

	}

	@GetMapping("/product/size")
	public ResponseEntity<String> getProductSize(@RequestParam("len") Integer length,
			@RequestParam("b") Integer bredth) {

		String mgs = "";

		if (length == 2 && bredth == 4) {

			mgs = "Apple Mobile Price : 800000 INR";
		} else if (length == 1 && bredth == 2) {
			mgs = "Samsung Mobile Price : 700000 INR";

		} else {

			mgs = "No Product Found";

		}

		return new ResponseEntity<String>(mgs, HttpStatus.OK);

	}

}