package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PersonController {
    @Autowired
    public PersonService pService;

    @PostMapping("/api/person")
    public ResponseEntity<Person> postMethodName(@RequestBody Person p) {
        if(pService.validate(p.getPersonId())==null){
            return new ResponseEntity<>(pService.postMethod(p),HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getMethodName() {
        if(pService.getMethod()!=null){
            return new ResponseEntity<>(pService.getMethod(),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<Person>> getMethodName(@RequestParam int param) {
       if(pService.getByAge(param)!=null){
         return new ResponseEntity<>(pService.getByAge(param),HttpStatus.OK);
       }
       return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
