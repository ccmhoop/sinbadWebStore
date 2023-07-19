package com.SimbadMart.maven.simbadMart.stock;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    Long id;
}
