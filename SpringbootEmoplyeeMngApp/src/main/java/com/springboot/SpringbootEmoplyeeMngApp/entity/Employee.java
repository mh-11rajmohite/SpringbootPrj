package com.springboot.SpringbootEmoplyeeMngApp.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "employee_table")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;

	@NotEmpty(message = "Name field is Empty")
	private String empName;

	
	private String empAddr;
	
	@Column(unique = true)
	@NotEmpty(message = "Email field is Empty")
	@Email
	private String email;

	@NotEmpty(message = "Password field is Empty")
	private String pwd;

	@Column(unique = true)
 	private Long phono;

	 
	@CreationTimestamp
	private LocalDateTime createdDate;

	@UpdateTimestamp
	private LocalDateTime updatedDate;

	
	
	
}
