package com.SimbadMart.maven.simbadMart.product;

import com.SimbadMart.maven.simbadMart.companyOrder.CompanyOrder;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    Long productID;

    String productType;

    Product(){
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<CompanyOrder> companyOrder = new ArrayList<>();

//    public void setMessages(List<CompanyOrder> companyOrder) {
//        this.companyOrder = companyOrder;
//    }
//
//    public List<CompanyOrder> getMessages() {
//        return companyOrder;
//    }

//    public Long getId() {
//        return productID;
//    }


}
