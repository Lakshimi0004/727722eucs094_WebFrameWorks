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
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private int CourseId;
    private String CourseName;
    private int creditHours;
    private String  instructors;
    private String preRequisites;
    private int maxcapacity;
    private String enrolledStudents;
}
