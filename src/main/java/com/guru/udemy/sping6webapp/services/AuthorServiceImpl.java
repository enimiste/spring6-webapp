package com.guru.udemy.sping6webapp.services;

import com.guru.udemy.sping6webapp.domaine.Author;
import com.guru.udemy.sping6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> getAllBooks() {
        return authorRepository.findAll();
    }
}
