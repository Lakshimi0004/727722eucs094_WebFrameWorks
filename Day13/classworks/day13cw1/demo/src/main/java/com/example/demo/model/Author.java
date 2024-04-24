package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Book book;
}
