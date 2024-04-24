package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public void postMethod(Product p){
        productRepository.save(p);
    }
    public Product get(int id){
        return productRepository.findById(id).orElse(null);
    }
    public void delete(int id){
        productRepository.deleteById(id);
    }
}
