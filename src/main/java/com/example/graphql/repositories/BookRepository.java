package com.example.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphql.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
