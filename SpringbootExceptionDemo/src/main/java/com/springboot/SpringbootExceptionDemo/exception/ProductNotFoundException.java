package com.springboot.SpringbootExceptionDemo.exception;

public class ProductNotFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Prodct Not Found";
	}
}
