package com.example.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphql.entities.Book;
import com.example.graphql.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRep;

	public Book create(Book book) {
		return bookRep.save(book);
	}

	public List<Book> getAll() {
		return bookRep.findAll();
	}

	public Book get(int bookId) {
		return bookRep.findById(bookId)
				.orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
	}

}
