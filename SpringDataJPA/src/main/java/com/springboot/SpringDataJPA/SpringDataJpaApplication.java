package com.springboot.SpringDataJPA;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.SpringDataJPA.entity.Gender;
import com.springboot.SpringDataJPA.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student_pu");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		Student st1 = new Student("Tim", 23, LocalDate.parse("2000-10-23"), Gender.MALE);

		em.persist(st1);

		/*
		 * Student st=(Student)em.find(Student.class, 5);
		 * 
		 * st.setGender(Gender.FEMALE);
		 * 
		 * em.persist(st);
		 */

		/*
		 * Student st=(Student)em.find(Student.class, 5);
		 * 
		 * em.remove(st);
		 */

		/*
		 * Student st=new Student();
		 * 
		 * st.setName("Amy");
		 * 
		 * st.setAge(23);
		 * 
		 * st.setDob(LocalDate.parse("1990-02-23"));
		 * 
		 * st.setGender(Gender.FEMALE);
		 * 
		 * em.persist(st);
		 */

		/*
		 * Student st=new Student();
		 * 
		 * st.setName("July");
		 * 
		 * st.setDob(LocalDate.parse("1993-02-23"));
		 * 
		 * st.setGender(Gender.FEMALE);
		 * 
		 * em.persist(st);
		 */

		/*
		 * Student st=(Student)em.find(Student.class, 8);
		 * 
		 * st.setAge(28);
		 * 
		 * em.persist(st);
		 * 
		 * et.commit();
		 */
		
		
		System.out.println("Success");

		em.close();

		emf.close();

	}

}
