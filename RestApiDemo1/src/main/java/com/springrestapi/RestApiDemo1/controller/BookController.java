package com.springrestapi.RestApiDemo1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.RestApiDemo1.service.BookService;

@RestController
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@GetMapping("/book")
	public ResponseEntity<List> getBook() {

		List<Book> list = new ArrayList<Book>();
		bookService.getBook().forEach(list::add);

		if (list.isEmpty()) {

			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List>(list, HttpStatus.OK);

	}

	/*
	 * @GetMapping("/books") public ResponseEntity<List<Book>> getBooks() {
	 * 
	 * Book book1 = new Book(101, "Java", 1200.0); Book book2 = new Book(102,
	 * "Python", 2200.0); Book book3 = new Book(103, "Oracle DB", 1000.0);
	 * 
	 * List<Book> list = Arrays.asList(book1, book2, book3);
	 * 
	 * return new ResponseEntity<>(list, HttpStatus.OK);
	 * 
	 * }
	 */

	@PostMapping(value = "/book")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {

		Book b = bookService.saveBook(book);

		return new ResponseEntity<Book>(book, HttpStatus.CREATED);

	}

	@DeleteMapping("/book")
	public ResponseEntity<String> deleteBook(@RequestParam("id") Integer id) {

		String msg = bookService.deleteBook(id);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@PutMapping(value = "/book/{id}")
	public ResponseEntity<String> updateBookByPut(@PathVariable("id") Integer id, @RequestBody Book book) {

		String msg = bookService.updateBook(book, id);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@PatchMapping(value = "/book/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> updateBookByPatch(@PathVariable("id") Integer id, @RequestBody Book book) {

		String msg = bookService.updateBook(book, id);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

}
