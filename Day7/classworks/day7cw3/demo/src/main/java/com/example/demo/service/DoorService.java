package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Door;
import com.example.demo.repository.DoorRepository;

@Service
public class DoorService {
    @Autowired
    public DoorRepository dRepository;

    public Door post(Door d){
        return dRepository.save(d);
    }
    public List<Door> get(){
        return dRepository.findAll();
    }
    public Door getById(int id){
        return dRepository.findById(id).orElse(null);
    }
    public List<Door>  getByAccessType(String type){
        return dRepository.findByAccessType(type);
    }
}
