package com.SimbadMart.maven.simbadMart.customer;

import com.SimbadMart.maven.simbadMart.customerDetails.CustomerDetails;
import com.SimbadMart.maven.simbadMart.product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customerdetails", nullable = false)
    private CustomerDetails customerDetails;

    //aanpassen
    public CustomerDetails getProduct() {
        return customerDetails;
    }


}
