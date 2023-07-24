package com.SimbadMart.maven.simbadMart.customer;

import com.SimbadMart.maven.simbadMart.ShopCart.ShopCart;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long Id;
    private String customerName;
    private String customerSurname;
    private String eMail;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String phone;
    private String password;
    private int timesOrdered;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<ShopCart> shopCart = new ArrayList<>();

    public Customer() {
    }

    public Customer(String customerName, String customerSurname, String eMail, String address, LocalDate dateOfBirth, String phone, List<ShopCart> shopCart, String password) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.eMail = eMail;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.shopCart = shopCart;
        this.password = password;
    }

    public int getTimesOrdered() {
        return timesOrdered;
    }

    public void setTimesOrdered(int timesOrdered) {
        this.timesOrdered = timesOrdered;
    }

    public Long getId() {
        return Id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public List<ShopCart> getShopCart() {
        return shopCart;
    }
}
