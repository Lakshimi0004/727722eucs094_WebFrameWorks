package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Person;
import java.util.List;


public interface PersonRepository extends JpaRepository<Person,Integer>{
    List<Person> findByAge(int age);
}
