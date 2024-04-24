package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/api/product")
    public ResponseEntity<Product> postMethodName(@RequestBody Product p) {
        if(productService.get(p.getProductId())==null){
        productService.postMethod(p);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @PutMapping("/api/product/{productId}")
    public ResponseEntity<Product> putMethodName(@PathVariable int id) {
        if(productService.get(id)!=null)
        {
            return new ResponseEntity<>(productService.get(id),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<Product> deleteMethod(@PathVariable int productId){
         if(productService.get(productId)!=null) {
             return new ResponseEntity<>(productService.get(productId),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
