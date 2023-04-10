package com.guru.udemy.sping6webapp.services;

import com.guru.udemy.sping6webapp.domaine.Book;

public interface BookService {
    Iterable<Book> getAllBooks();
}
