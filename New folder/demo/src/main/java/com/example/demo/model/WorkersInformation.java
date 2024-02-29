package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class WorkersInformation {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String feild;
    private String exp;
    private String city;
     


    @JsonBackReference
    @JoinColumn(name = "Worker_id")
    @OneToOne( cascade = CascadeType.ALL)
    private Workers workers;
}
