package com.springboot.SpringDataJPA.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stuid")
	private Integer id;

	@Column(name = "stuname")
	private String name;

	private Integer age;

	@Temporal(TemporalType.DATE)
	private LocalDate dob;

	@Enumerated(EnumType.ORDINAL)
	private Gender gender;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Integer age, LocalDate localDate, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = localDate;
		this.gender = gender;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	
}
