package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CourseController {
    @Autowired
    public CourseService cService;

    @PostMapping("/api/course")
    public ResponseEntity<Course> postMethodName(@RequestBody Course c) {
        if(cService.validate(c.getCourseId())!=null){
            return new ResponseEntity<>(cService.validate(c.getCourseId()),HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/course")
    public ResponseEntity<List<Course>> getMethodName() {
        if(cService.getMethod()!=null){
            return new ResponseEntity<>(cService.getMethod(),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<Course>> getMethodName(@PathVariable String name) {
        if(cService.getByCourseName(name)!=null){
            return new ResponseEntity<>(cService.getByCourseName(name),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
