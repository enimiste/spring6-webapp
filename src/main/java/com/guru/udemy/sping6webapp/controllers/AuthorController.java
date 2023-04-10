package com.guru.udemy.sping6webapp.controllers;

import com.guru.udemy.sping6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("")
    public String listAllAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllBooks());
        return "authors";
    }
}
