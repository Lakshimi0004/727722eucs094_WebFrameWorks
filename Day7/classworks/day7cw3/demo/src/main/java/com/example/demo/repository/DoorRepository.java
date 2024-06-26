package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Door;

public interface DoorRepository extends JpaRepository<Door,Integer>{
    List<Door> findByAccessType(String accessType);
}
