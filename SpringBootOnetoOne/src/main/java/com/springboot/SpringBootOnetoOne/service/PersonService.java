package com.springboot.SpringBootOnetoOne.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootOnetoOne.entity.Passport;
import com.springboot.SpringBootOnetoOne.entity.Person;
import com.springboot.SpringBootOnetoOne.repository.PassportRepository;
import com.springboot.SpringBootOnetoOne.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PassportRepository passRepo;

	@Autowired
	private PersonRepository personRepo;

	public void savePersonWithPassport() {

		Passport passport = new Passport();
		passport.setPassportNum("axrby123");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));

		Person person = new Person();
		person.setName("Abhay");
		person.setGender("Male");
		
		
		
		passport.setPerson(person);
		person.setPassport(passport);
		
		personRepo.save(person);
	}
}
