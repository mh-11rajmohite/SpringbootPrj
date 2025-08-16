package com.springboot.SpringBootOnetoOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringBootOnetoOne.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
