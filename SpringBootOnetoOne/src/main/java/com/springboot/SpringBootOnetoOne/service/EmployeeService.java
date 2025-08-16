package com.springboot.SpringBootOnetoOne.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootOnetoOne.entity.Address;
import com.springboot.SpringBootOnetoOne.entity.Employee;
import com.springboot.SpringBootOnetoOne.repository.AddressRepository;
import com.springboot.SpringBootOnetoOne.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private AddressRepository addrRepo;

	@Autowired
	private EmployeeRepository empRepo;

	public void saveEmpWithAddress() {

		Address a1 = new Address();
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		a1.setType("Persent");

		Address a2 = new Address();
		a2.setCity("Satara");
		a2.setState("Maharashtra");
		a2.setType("Permanent");

		Employee emp = new Employee();
		emp.setEmpName("Raj");
		emp.setEsal(100000.0);

		a1.setEmp(emp);
		a2.setEmp(emp);

		emp.setAddr(Arrays.asList(a1, a2));

		empRepo.save(emp);
	}

}
