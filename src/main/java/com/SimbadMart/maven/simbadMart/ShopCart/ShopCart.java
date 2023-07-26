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

    public ShopCart(int amount, Storage storage, Customer customer, int customerTimesOrdered) {
        this.amount = amount;
        this.storage = storage;
        this.customer = customer;
        this.customerTimesOrdered = customerTimesOrdered;
    }

    public Long getShopCartID() {
        return ShopCartID;
    }

    public int getAmount() {
        return amount;
    }

    public void setShopCartID(Long shopCartID) {
        ShopCartID = shopCartID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
