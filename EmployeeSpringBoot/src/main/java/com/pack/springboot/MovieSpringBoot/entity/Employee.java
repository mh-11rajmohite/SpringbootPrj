package com.pack.springboot.MovieSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer id;
	
	private String name;
	private String address;
	private Double sal;
	private String desgination;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(Integer id, String name, String address, Double sal, String desgination) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
		this.desgination = desgination;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Double getSal() {
		return sal;
	}



	public void setSal(Double sal) {
		this.sal = sal;
	}



	public String getDesgination() {
		return desgination;
	}



	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + ", desgination="
				+ desgination + "]";
	}
	
	
	
	
	
}
