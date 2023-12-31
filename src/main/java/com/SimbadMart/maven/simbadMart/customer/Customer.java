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
    @Column(unique = true)
    private String eMail;
    private String address;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String phone;
    private String password;
    private int timesOrdered;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<ShopCart> shopCart = new ArrayList<>();

    public Customer() {
    }

    public Customer(String customerName, String customerSurname, String eMail, String address, UserRole role, LocalDate dateOfBirth, String phone, String password, int timesOrdered, List<ShopCart> shopCart) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.eMail = eMail;
        this.address = address;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.password = password;
        this.timesOrdered = timesOrdered;
        this.shopCart = shopCart;
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

    public UserRole getRole() {
        return role;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
