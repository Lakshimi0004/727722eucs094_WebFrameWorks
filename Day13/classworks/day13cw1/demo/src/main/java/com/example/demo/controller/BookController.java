package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;
import com.example.demo.service.BookService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
    @Autowired
    public BookService bService;
    @Autowired
    public AuthorService aService;
    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<Book> postMethodName(@RequestBody Book b,@PathVariable int authorId) {
       try{
          Author a=aService.getById(authorId);
          b.setAuthor(a);
          return new ResponseEntity<>( bService.postMethod(b),HttpStatus.CREATED);
       }
       catch(Exception e){
        return new ResponseEntity<>( null,HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
    
}
