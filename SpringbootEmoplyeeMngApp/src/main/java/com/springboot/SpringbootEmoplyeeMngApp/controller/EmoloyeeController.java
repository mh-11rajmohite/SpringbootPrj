package com.springboot.SpringbootEmoplyeeMngApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.SpringbootEmoplyeeMngApp.entity.Employee;
import com.springboot.SpringbootEmoplyeeMngApp.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmoloyeeController {

	private EmployeeService empService;

	public EmoloyeeController(EmployeeService empService) {
		super();
		this.empService = empService;
	}

	@GetMapping("/")
	public String login(Model model) {

		Employee emp = new Employee();
		model.addAttribute("emp", emp);

		return "login";
	}

	@PostMapping("/login")
	public String handelLoginBtn(Employee emp, BindingResult result, HttpServletRequest request, Model model) {

		if (result.hasErrors()) {

			return "login";

		} else {

			Employee e = empService.login(emp.getEmail(), emp.getPwd());
			if (e == null) {
				model.addAttribute("emsg", "Invalid Credientials");
				return "login";

			} else {

				HttpSession session = request.getSession(true);
				session.setAttribute("empId", e.getEmpId());
				return "redirect:/dashboard";
			}
		}
	}

	@GetMapping("/dashboard")
	public String dashboardDisply(Model model) {

		model.addAttribute("msg", "Login Sucessful!! Welcome Page");

		return "dashboard";
	}

	@GetMapping("/register")
	public String handelSubButton(Employee emp, Model model) {

		boolean savedEmp = empService.saveEmp(emp);

		if (savedEmp) {
			model.addAttribute("smsg", "Registration Sucessfull !!");

		} else {
			model.addAttribute("emsg", "Try Again Later !!");
		}

		return "registration";
	}

}
