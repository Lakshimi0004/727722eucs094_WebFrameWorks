package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineModel {
    @Id
    private int medicineId;
    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufacturedId;
    private double medicinePrice;
    private String expiryDate;
}
