package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Job;
import com.example.demo.service.JobService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class JobController {
    @Autowired
    public JobService jobService;

    @PostMapping("/api/job")
    public String postMethodName(@RequestBody Job entity) {
       
        jobService.postMethod(entity);
        return "saved";
    }

    @GetMapping("/api/jobs")
    public List<Job> getMethodName() {
        return jobService.getMethod();
    }

    @GetMapping("/api/job/{jobId}")
    public Job getMethod(@PathVariable("jobId") int id) {
        return jobService.getMethodId(id);
    }
    
}
