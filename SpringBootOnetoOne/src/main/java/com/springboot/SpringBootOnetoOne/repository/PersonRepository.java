package com.springboot.SpringBootOnetoOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SpringBootOnetoOne.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
