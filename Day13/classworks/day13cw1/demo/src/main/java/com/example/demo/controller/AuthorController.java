package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class AuthorController {
    @Autowired
    public AuthorService aService;

    @PostMapping("/author")
    public ResponseEntity<Author> postMethodName(@RequestBody Author a) {
       if(aService.getById(a.getId())==null){
         return new ResponseEntity<>(aService.postMethod(a),HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/author/{authorId}")
    public ResponseEntity<Author> getMethodName(@PathVariable int id) {
        if(aService.getById(id)!=null){
            return new ResponseEntity<>(aService.getById(id),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/author")
    public ResponseEntity<List<Author>> getMethodName() {
        if(aService.get()!=null){
            return new ResponseEntity<>(aService.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PutMapping("/author/{authorId}")
    public ResponseEntity<Author> putMethodName(@PathVariable int id, @RequestBody Author a) {

        Author ex=aService.getById(id);
        if(ex!=null){
            ex.setAddress(a.getAddress());
            ex.setEmail(a.getEmail());
            ex.setPhoneNumber(a.getPhoneNumber());
            return new ResponseEntity<>(aService.postMethod(ex),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        
     
    }
    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> delete(@PathVariable int id){
        if(aService.getById(id)!=null){
            aService.deleteMethod(id);
            return new ResponseEntity<>("Book deleted successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("Book not found with ID:"+id,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
