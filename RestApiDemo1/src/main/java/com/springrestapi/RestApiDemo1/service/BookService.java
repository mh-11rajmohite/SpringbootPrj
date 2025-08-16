package com.springrestapi.RestApiDemo1.service;

import java.util.List;

import com.springrestapi.RestApiDemo1.controller.Book;

public interface BookService {

	public Book saveBook(Book book);

	public List<Book> getBook();

	public String deleteBook(Integer id);

	public String updateBook(Book book, Integer id);

	public String patchBook(Book book, Integer id);
}
