package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	List<Book> findAllBook();

	Book findBookById(int id);

	void deleteBooks();
	/* Book addBook(); */
}
