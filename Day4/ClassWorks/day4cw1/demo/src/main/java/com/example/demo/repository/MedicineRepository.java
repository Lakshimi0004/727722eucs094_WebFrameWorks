package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MedicineModel;

public interface MedicineRepository extends JpaRepository<MedicineModel,Integer>{
    
}
