package com.example.demo.model;

import lombok.*;

@Data
public class Book {
	private String name;
	private int id;
	private String author;

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

}
