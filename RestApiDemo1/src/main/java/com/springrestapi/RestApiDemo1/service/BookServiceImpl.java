package com.springrestapi.RestApiDemo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.RestApiDemo1.controller.Book;
import com.springrestapi.RestApiDemo1.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepo;

	public BookServiceImpl(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub

		return bookRepo.save(new Book(book.getId(), book.getName(), book.getPrice()));
	}

	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub

		return bookRepo.findAll();

	}

	@Override
	public String deleteBook(Integer id) {

		if (bookRepo.existsById(id)) {
			bookRepo.deleteById(id);
			return "Book Deleted Successfully";
		} else {

			return "Record Not Found";

		}

	}

	@Override
	public String updateBook(Book book, Integer id) {

		if (bookRepo.existsById(id)) {
			bookRepo.save(book);
			return "Book Updated Successfully";
		} else {

			return "Record Not Found";

		}

	}

	@Override
	public String patchBook(Book book, Integer id) {

		if (bookRepo.existsById(id)) {
			bookRepo.save(book);
			return "Book Updated Successfully";
		} else {

			return "Record Not Found";

		}

	}

}
