

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Language;
import com.example.demo.service.LanguageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


public class LanguageController {

@RestController
public class ProductController {
    @Autowired
    public LanguageService lService;

    @PostMapping("/langugae")
    public ResponseEntity<Language> postMethodName(@RequestBody Language p) {
        if(lService.getMethodId(p.getLanguageId())==null){
        lService.postMethod(p);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/language")
    public List<Language> getMethodName() {
        return lService.getMethod();
    }
    
    @GetMapping("/langugae/{languageId}")
    public Language getMethodName(@PathVariable int id) {
        return lService.getMethodId(id);
    }
    
    @PutMapping("/language/{languageId}")
    public ResponseEntity<Language> putMethodName(@PathVariable int id) {
        if(lService.getMethodId(id)!=null)
        {
            return new ResponseEntity<>(lService.getMethodId(id),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/language/{languageId}")
    public ResponseEntity<Boolean> deleteMethod(@PathVariable int productId){
         if(lService.getMethodId(productId)!=null) {
            lService.delete(productId);
             return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }


}

}
