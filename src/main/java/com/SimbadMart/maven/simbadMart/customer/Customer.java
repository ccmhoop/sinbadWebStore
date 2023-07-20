package com.SimbadMart.maven.simbadMart.customer;

import com.SimbadMart.maven.simbadMart.ShopCart.ShopCart;
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

    public Customer(String customerName, String customerSurname, String e_mail, String address, int phone, List<ShopCart> shopCart) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.e_mail = e_mail;
        this.address = address;
        this.phone = phone;
        this.shopCart = shopCart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }
    public List<ShopCart> getShopCart() {
        return shopCart;
    }
}
