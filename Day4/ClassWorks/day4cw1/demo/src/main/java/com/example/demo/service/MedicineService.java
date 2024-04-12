package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MedicineModel;
import com.example.demo.repository.MedicineRepository;

@Service
public class MedicineService {
    @Autowired
    public MedicineRepository medicineRepository;
    public MedicineModel postMedicine(MedicineModel medicineModel){
        return medicineRepository.save(medicineModel);
    }
    public List<MedicineModel> getMedicine(MedicineModel medicineModel){
        return medicineRepository.findAll();
    }
    public MedicineModel getMedicineId(int id){
        return medicineRepository.findById(id).orElse(null);
    }
}
