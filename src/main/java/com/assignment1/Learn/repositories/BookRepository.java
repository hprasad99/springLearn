package com.assignment1.Learn.repositories;

import com.assignment1.Learn.domain.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{
      
}
