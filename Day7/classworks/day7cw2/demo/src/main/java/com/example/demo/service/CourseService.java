package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {
    @Autowired
    public CourseRepository cRepository;

    public Course postMethod(Course c){
        return cRepository.save(c);
    }

    public List<Course> getMethod(){
        return cRepository.findAll();
    }

    public List<Course> getByCourseName(String CourseName){
        return cRepository.findByCourseName(CourseName);
    }

    public Course validate(int id){
        return cRepository.findById(id).orElse(null);
    }
}
