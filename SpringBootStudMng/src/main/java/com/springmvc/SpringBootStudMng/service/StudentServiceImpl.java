package com.springmvc.SpringBootStudMng.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.SpringBootStudMng.entity.Student;
import com.springmvc.SpringBootStudMng.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studRepo;
	private EmailService emailService;

	public StudentServiceImpl(StudentRepository studRepo, EmailService emailService) {
		super();
		this.studRepo = studRepo;
		this.emailService = emailService;
	}

	@Override
	public boolean saveStudent(Student s) {

		Student stud = studRepo.save(s);

		String subject = "Student Registration";
		String body = "<h2>Your Account has been created Successfully!!!!</he>";
	
		emailService.sendEmailNAttach(subject, body, s.getEmail());

 
		return stud.getId() != null;
	}

	@Override
	public List<Student> getAllStudent() {

		return studRepo.findAll();
	}

	@Override
	public void delete(Integer sid) {

		studRepo.deleteById(sid);

	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studRepo.findById(id).get();
	}
 

}
