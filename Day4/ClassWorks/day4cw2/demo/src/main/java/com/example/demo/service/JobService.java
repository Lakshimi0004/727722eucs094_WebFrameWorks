package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Job;
import com.example.demo.repository.JobRepository;

@Service
public class JobService {
    @Autowired
    public JobRepository jobRepository;

    public Job postMethod(Job j){
        return jobRepository.save(j);
    }

    public List<Job> getMethod(){
         return jobRepository.findAll();
    }

    public Job getMethodId(int id){
        return jobRepository.findById(id).orElse(null);
    }
}
