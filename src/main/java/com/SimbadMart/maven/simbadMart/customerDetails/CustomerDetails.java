package com.SimbadMart.maven.simbadMart.customerDetails;

import com.SimbadMart.maven.simbadMart.companyOrder.CompanyOrder;
import com.SimbadMart.maven.simbadMart.customer.Customer;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CustomerDetails {

    @Id
    @GeneratedValue
    Long productID;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customerdetails")
    private List<Customer> customer = new ArrayList<>();
}
