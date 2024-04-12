package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MedicineModel;
import com.example.demo.service.MedicineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class MedicineController {
    @Autowired
    public MedicineService medicineService;

     @PostMapping("/api/medicine")
     public MedicineModel postMethodName(@RequestBody MedicineModel m) {
         return medicineService.postMedicine(m);
     }
     @GetMapping("/api/medicines")
     public List<MedicineModel> getMethodName() {
         return medicineService.getMedicine(null);
     }
     @GetMapping("/api/medicine/{medicineId}")
     public MedicineModel getMethod(@PathVariable("medicineId") int id) {
         return medicineService.getMedicineId(id);
     }
     
}
