package com.SimbadMart.maven.simbadMart.ShopCart;

import com.SimbadMart.maven.simbadMart.customer.Customer;
import com.SimbadMart.maven.simbadMart.storage.Storage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ShopCart {
    @Id
    @GeneratedValue
    Long ShopCartID;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storageid", nullable = false)
    private Storage storage;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid", nullable = false)
    private Customer customer;

    public ShopCart() {
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
