package com.SimbadMart.maven.simbadMart.product;

import com.SimbadMart.maven.simbadMart.storage.Storage;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    Long productID;
    String productType;
    String Description;
    BigDecimal productPrice;
    BigDecimal unitCost;

    Product(){
    }

    public Product(String productType, String description, BigDecimal productPrice, BigDecimal unitCost) {
        this.productType = productType;
        Description = description;
        this.productPrice = productPrice;
        this.unitCost = unitCost;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Storage> storage = new ArrayList<>();

    public Long getProductID() {
        return productID;
    }

    public String getProductType() {
        return productType;
    }

    public String getDescription() {
        return Description;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }
}
