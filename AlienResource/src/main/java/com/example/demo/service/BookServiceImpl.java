package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookServiceImpl implements BookService {

	private List<Book> books = new ArrayList<>();

	public BookServiceImpl() {
		books.add(new Book(1, "The Great Gatsby", "F.Scott"));
		books.add(new Book(2, "1984", "George Orwell"));
		books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
	}

	@Override
	public List<Book> findAllBook() {
		return books;
	}

	@Override
	public Book findBookById(int id) {
		return books.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
	}

	@Override
	public void deleteBooks() {
		books.clear();

	}
	

}
