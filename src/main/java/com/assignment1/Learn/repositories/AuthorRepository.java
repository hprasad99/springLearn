package com.assignment1.Learn.repositories;

import com.assignment1.Learn.domain.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}