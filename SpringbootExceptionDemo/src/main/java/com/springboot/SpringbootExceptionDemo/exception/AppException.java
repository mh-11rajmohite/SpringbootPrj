package com.springboot.SpringbootExceptionDemo.exception;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.SpringbootExceptionDemo.controller.MsgController;

@ControllerAdvice
public class AppException {

	private Logger logger = LoggerFactory.getLogger(MsgController.class);

	@ExceptionHandler(value = ProductNotFoundException.class)
	public String haProductException(ProductNotFoundException e, Model model) {

		logger.error(e.getMessage());
		model.addAttribute("emsg", e.getMessage());
		return "errorpage";
	}

	
	@ExceptionHandler(value = NullPointerException.class)
	public String handelNPException(NullPointerException e, Model model) {

		logger.error(e.getMessage());
		model.addAttribute("emsg", e.getMessage());
		return "errorpage";
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String handelArthiException(ArithmeticException e, Model model) {

		logger.error(e.getMessage());
		model.addAttribute("emsg", e.getMessage());
		return "errorpage";
	}
	
	@ExceptionHandler(value = SQLException.class)
	public String handelSQLException(SQLException e, Model model) {

		logger.error(e.getMessage());
		model.addAttribute("emsg", e.getMessage());
		return "errorpage";
	}
	@ExceptionHandler(value = Exception.class)
	public String handelException(Exception e, Model model) {

		logger.error(e.getMessage());
		model.addAttribute("emsg", e.getMessage());
		return "errorpage";
	}

	
	// Or we can write in this way 
	
	/*
	 * @ExceptionHandler(value = Exception.class) public String
	 * handelExceptions(Exception e, Model model) {
	 * 
	 * 
	 * if(e instanceof NullPointerException) {
	 * 
	 * 
	 * }else if(e instanceof ArithmeticException) {
	 * 
	 * 
	 * }else {
	 * 
	 * 
	 * }
	 * 
	 * logger.error(e.getMessage());
	 * model.addAttribute("msg","Some Problem Occured");
	 * 
	 * model.addAttribute("emsg", e.getMessage()); return "errorpage"; }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
