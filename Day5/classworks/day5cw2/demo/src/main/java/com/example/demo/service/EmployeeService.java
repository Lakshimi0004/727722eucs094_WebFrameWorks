package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
  
    @Autowired
    public EmployeeRepo eRepository;

    public void postMethod(Employee p){
        eRepository.save(p);
    }
    public Employee get(int id){
        return eRepository.findById(id).orElse(null);
    }
    public void delete(int id){
        eRepository.deleteById(id);
    }
}

