package com.example1.day2cw2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentModel {
    @JsonProperty
    public String name;

    @JsonProperty
    public int age;
    public StudentModel(String name,int age){
        this.name=name;
        this.age=age;
    }
}
