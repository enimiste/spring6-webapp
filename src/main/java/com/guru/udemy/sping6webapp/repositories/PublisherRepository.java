package com.guru.udemy.sping6webapp.repositories;

import com.guru.udemy.sping6webapp.domaine.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
