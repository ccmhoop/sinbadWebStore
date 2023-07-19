package com.SimbadMart.maven.simbadMart.companyOrder;

import com.SimbadMart.maven.simbadMart.product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class CompanyOrder {
    @Id
    @GeneratedValue
    Long CompanyOrderID;

    String amount;

    CompanyOrder(){
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productid", nullable = false)
    private Product product;

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }

}
