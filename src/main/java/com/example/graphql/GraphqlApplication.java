package com.example.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.graphql.entities.Book;
import com.example.graphql.service.BookService;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("XYZ");

		Book b2 = new Book();
		b2.setTitle("Think Java");
		b2.setDesc("For learning java");
		b2.setPages(3000);
		b2.setPrice(5000);
		b2.setAuthor("ABC");

		Book b3 = new Book();
		b3.setTitle("Head first to java");
		b3.setDesc("For starting java concepts");
		b3.setPages(1000);
		b3.setPrice(2000);
		b3.setAuthor("PQR");

		bookService.create(b1);
		bookService.create(b2);
		bookService.create(b3);

	}

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
