package com.backendmarch.librarymanagementsystem.Controller;

import com.backendmarch.librarymanagementsystem.Entity.Author;
import com.backendmarch.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
// H.W change author to DTO
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author added successfully";

    }
    @GetMapping("/get_authors")
        public List<Author> getAuthor(){
            return authorService.getAuthor();
        }

}

