package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    public PersonRepository pRepository;

    public Person postMethod(Person p){
        return pRepository.save(p);
    }
    public List<Person> getMethod(){
        return pRepository.findAll();
    }
    public List<Person> getByAge(int age){
        return pRepository.findByAge(age);
    }
    public Person validate(int id){
        return pRepository.findById(id).orElse(null);
    }
}
