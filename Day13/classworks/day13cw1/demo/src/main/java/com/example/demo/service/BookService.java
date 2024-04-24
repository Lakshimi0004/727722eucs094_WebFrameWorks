package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    public BookRepository bRepository;

    public Book postMethod(Book b){
        return bRepository.save(b);
    }

    public Book getById(int id){
        return bRepository.findById(id).orElse(null);
    }
}
