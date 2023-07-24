package com.SimbadMart.maven.simbadMart.ShopCart;

import com.SimbadMart.maven.simbadMart.customer.Customer;
import com.SimbadMart.maven.simbadMart.storage.Storage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class ShopCart {
    @Id
    @GeneratedValue
    Long ShopCartID;

    int amount;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storageid", nullable = false)
    private Storage storage;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid", nullable = false)
    private Customer customer;

    private int customerTimesOrdered;

    public ShopCart() {
    }

    public ShopCart(int amount, Storage storage, Customer customer) {
        this.amount = amount;
        this.storage = storage;
        this.customer = customer;
    }

    public int getCustomerTimesOrdered() {
        return customerTimesOrdered;
    }

    public void setCustomerTimesOrdered(int customerTimesOrdered) {
        this.customerTimesOrdered = customerTimesOrdered;
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
