package com.example1.day2cw2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.day2cw2.model.StudentModel;

@RestController
public class DataController {
    @GetMapping("/students")
    public StudentModel getInfo(){
       return new StudentModel("Lakshimi Priya",19);
    }

}
