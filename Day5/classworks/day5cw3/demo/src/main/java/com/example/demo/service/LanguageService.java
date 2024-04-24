package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepository;

@Service
public class LanguageService {
    @Autowired LanguageRepository lRepository;

    public Language postMethod(Language L){
        return lRepository.save(L);
    }
    public List<Language> getMethod(){
        return lRepository.findAll();
    }
    public Language getMethodId(int id){
        return lRepository.findById(id).orElse(null);
    }
    public void delete(int id){
        lRepository.deleteById(id);
    }
}
