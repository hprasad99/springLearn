package com.assignment1.Learn.bootstrap;

import com.assignment1.Learn.domain.Author;
import com.assignment1.Learn.domain.Book;
import com.assignment1.Learn.domain.Publisher;
import com.assignment1.Learn.repositories.AuthorRepository;
import com.assignment1.Learn.repositories.BookRepository;
import com.assignment1.Learn.repositories.PublisherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
      private final AuthorRepository authorRepository;
      private final BookRepository bookRepository;
      private final PublisherRepository publisherRepository;


      public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
            this.authorRepository = authorRepository;
            this.bookRepository = bookRepository;
            this.publisherRepository = publisherRepository;
      }
      

      @Override
      public void run(String... args) throws Exception {

            Author eric = new Author("Eric", "Evans");
            Book bkName = new Book("Design Algorithm", "1231");
            Publisher playboy = new Publisher("PlayBoy","Spine-City","Pune","Maharashtra","412105");
            eric.getBooks().add(bkName);
            //bkName.getAuthors().add(eric);

            authorRepository.save(eric);
            bookRepository.save(bkName);
            publisherRepository.save(playboy);

            Author rod = new Author("Rod", "Johnson");
            Book noEJB = new Book("J2EE Development without EJB", "3939459459");
            rod.getBooks().add(noEJB);
            //noEJB.getAuthors().add(rod);

            authorRepository.save(rod);
            bookRepository.save(noEJB);

            System.out.println("Started in BootStrap");
            System.out.println("Number of books: " + bookRepository.count());
            System.out.println("Number of Publisher: "+ publisherRepository.count());
      }
}