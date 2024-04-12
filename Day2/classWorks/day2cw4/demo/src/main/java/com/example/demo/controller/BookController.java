package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class BookController {
    @GetMapping("/book")
    public Book getMethodName() {
        return new Book("The Great Soldier","G. Gyan");
    }
    
}
