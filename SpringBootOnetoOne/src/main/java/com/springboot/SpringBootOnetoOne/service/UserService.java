package com.springboot.SpringBootOnetoOne.service;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootOnetoOne.entity.Roles;
import com.springboot.SpringBootOnetoOne.entity.User;
import com.springboot.SpringBootOnetoOne.repository.RolesRepository;
import com.springboot.SpringBootOnetoOne.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RolesRepository rolesRepo;

	public void saveUserWithRoles() {

		Roles r1 = new Roles();
		r1.setRoleName("Project Manager");

		Roles r2 = new Roles();
		r2.setRoleName("Project Owner");

		ArrayList<Roles> rlist1 = new ArrayList<Roles>();
		rlist1.add(r1);
		rlist1.add(r2);

		ArrayList<Roles> rlist2 = new ArrayList<Roles>();
		rlist2.add(r1);
		rlist2.add(r2);

		User u1 = new User();
		u1.setName("Raj");
		u1.setGender("Male");
		u1.setRoles(rlist1);

		User u2 = new User();
		u2.setName("Priya");
		u2.setGender("Female");
		u2.setRoles(rlist2);

		userRepo.save(u1);
		userRepo.save(u2);
		
		
	}

}
