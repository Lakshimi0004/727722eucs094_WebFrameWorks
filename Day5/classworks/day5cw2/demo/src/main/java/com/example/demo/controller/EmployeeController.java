package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService eService;

    @PostMapping("/api/employee")
    public ResponseEntity<Employee> postMethodName(@RequestBody Employee p) {
        if(eService.get(p.getEmployeeId())==null){
        eService.postMethod(p);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<Employee> putMethodName(@PathVariable int id) {
        if(eService.get(id)!=null)
        {
            return new ResponseEntity<>(eService.get(id),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<Employee> deleteMethod(@PathVariable int productId){
         if(eService.get(productId)!=null) {
             return new ResponseEntity<>(eService.get(productId),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
