package com.springrestapi.RestApiDemo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrestapi.RestApiDemo1.controller.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
