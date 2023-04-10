package com.guru.udemy.sping6webapp.services;

import com.guru.udemy.sping6webapp.domaine.Book;
import com.guru.udemy.sping6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
