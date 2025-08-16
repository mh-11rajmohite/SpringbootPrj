package com.springboot.SpringBootOnetoOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SpringBootOnetoOne.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
