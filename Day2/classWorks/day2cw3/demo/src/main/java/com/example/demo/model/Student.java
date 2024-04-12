package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    public long id;
    public String name;
    @JsonIgnore
    public String description;
    public Student(long id,String name,String desc){
        this.id=id;
        this.name=name;
        this.description=desc;
    }
}
