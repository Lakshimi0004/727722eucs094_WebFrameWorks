package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Language;

public interface LanguageRepository extends JpaRepository<Language,Integer>{
    
}
