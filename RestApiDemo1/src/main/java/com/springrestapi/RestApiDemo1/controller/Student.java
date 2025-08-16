package com.springrestapi.RestApiDemo1.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Student {

	@Id
	private Integer id;
	private String name;
	private Integer age;

}
