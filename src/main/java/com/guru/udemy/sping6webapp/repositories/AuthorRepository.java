package com.guru.udemy.sping6webapp.repositories;

import com.guru.udemy.sping6webapp.domaine.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
