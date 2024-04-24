package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    public AuthorRepository aRepository;
    public Author postMethod(Author a){
        return aRepository.save(a);
    }
    public Author getById(int id){
        return aRepository.findById(id).orElse(null);
    }
    public List<Author> get(){
        return aRepository.findAll();
    }
    public void deleteMethod(int id){
        aRepository.deleteById(id);
    }
}
