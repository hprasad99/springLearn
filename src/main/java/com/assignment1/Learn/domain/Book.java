package com.assignment1.Learn.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import net.bytebuddy.implementation.HashCodeMethod;

@Entity
public class Book {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;

      private String isbn;
      private String title;

      @ManyToMany
      @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
      private Set<Author> authors;

      public Book() {
      }

      public Book(String isbn, String title, Set<Author> authors) {
            this.isbn = isbn;
            this.title = title;
            this.authors = authors;
      }

      public String getIsbn() {
            return this.isbn;
      }

      public Long getId() {
            return this.id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public void setIsbn(String isbn) {
            this.isbn = isbn;
      }

      public String getTitle() {
            return this.title;
      }

      public void setTitle(String title) {
            this.title = title;
      }

      public Set<Author> getAuthors() {
            return this.authors;
      }

      public void setAuthors(Set<Author> authors) {
            this.authors = authors;
      }

      @Override
      public String toString() {
            return "{" +
                        " id='" + getId() + "'" +
                        ", isbn='" + getIsbn() + "'" +
                        ", title='" + getTitle() + "'" +
                        ", authors='" + getAuthors() + "'" +
                        "}";
      }

      @Override
      public boolean equals(Object o) {
            if (this == o)
                  return true;
            if (o == null || getClass() != o.getClass())
                  return false;
            Book book = (Book) o;
            return id != null ? id.equals(book.id) : book.id == null;
      }

      @Override
      public int hashCode() {
            return id != null ? id.hashCode() : 0;
      }
}
