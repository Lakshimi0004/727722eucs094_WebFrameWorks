package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getMethodName() {
        return new Student(1,"Lakshimi Priya","This is a sample description");
    }
}
