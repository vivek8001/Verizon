package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class MyController {

	@Autowired
	private BookService bookservice;

	@GetMapping("/")
	public String home() {
		return "Welcome to Api ";
	}

	@GetMapping("/findbyid/{id}")
	public Book findBookById(@PathVariable int id) {
		return bookservice.findBookById(id);
	}

	@GetMapping("/findallbooks")
	public List<Book> findAllBook() {
		return bookservice.findAllBook();
	}

	@DeleteMapping("/delete")
	public String deleteAllBooks() {
		bookservice.deleteBooks();
		return "All books are deleted. ";
	}
	/*
	 * @PostMapping("/enterDetails") public List<Book> addBook(){ return
	 * bookservice.
	 * 
	 * String insert(@RequestBody Book b) { books.add(new
	 * Book(b.getId(),b.getAuthor(),b.getName()));
	 * 
	 * for(Book b1:books) { System.out.println(b1.getId()+ "  "+b1.getAuthor()); }
	 * return "data insreted"; }
	 */

}
