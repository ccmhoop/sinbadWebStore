package com.SimbadMart.maven.simbadMart.customer;

import com.SimbadMart.maven.simbadMart.ShopCart.ShopCart;
import com.SimbadMart.maven.simbadMart.storage.Storage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    Long Id;
    String customerName;
    String customerSurname;
    String e_mail;
    String address;
    int phone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<ShopCart> shopCart = new ArrayList<>();
    public Customer() {
    }

//    public List<ShopCart> getShopCart() {
//        return shopCart;
//    }
}
