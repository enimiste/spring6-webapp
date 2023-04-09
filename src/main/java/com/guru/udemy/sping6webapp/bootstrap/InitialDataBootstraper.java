package com.guru.udemy.sping6webapp.bootstrap;

import com.guru.udemy.sping6webapp.domaine.Author;
import com.guru.udemy.sping6webapp.domaine.Book;
import com.guru.udemy.sping6webapp.domaine.Publisher;
import com.guru.udemy.sping6webapp.repositories.AuthorRepository;
import com.guru.udemy.sping6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialDataBootstraper implements CommandLineRunner {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public InitialDataBootstraper(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Author rod = new Author("Rod", "Jonson");
        Author juergen = new Author("Juergen", "Hoeller");
        Author joshua = new Author("Joshua", "Bloch");

        Book ddd = new Book("Domain Driven Design", "123456");//Addison Wesley
        Book ejb = new Book("Expert One-on-One JEE without EJB", "789AB");//Wiley Publishing
        Book effectiveJava = new Book("Effective Java", "4462JH");//Addison Wesley

        Publisher addison = new Publisher("Addison Wesley");
        Publisher wiley = new Publisher("Wiley Publishing");

        authorRepository.save(eric);
        authorRepository.save(rod);
        authorRepository.save(juergen);
        authorRepository.save(joshua);

        bookRepository.save(ddd);
        bookRepository.save(ejb);
        bookRepository.save(effectiveJava);

        ddd.addAuthor(eric);
        ejb.addAuthor(rod);
        ejb.addAuthor(juergen);
        effectiveJava.addAuthor(joshua);
        bookRepository.save(ddd);
        bookRepository.save(ejb);
        bookRepository.save(effectiveJava);

        System.out.println("Authors count : " + authorRepository.count());
        System.out.println("Books count : " + bookRepository.count());
        bookRepository.findAll()
                .forEach(System.out::println);
    }
}
