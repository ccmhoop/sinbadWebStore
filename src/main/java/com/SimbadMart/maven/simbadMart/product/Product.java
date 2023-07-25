package com.SimbadMart.maven.simbadMart.product;

import com.SimbadMart.maven.simbadMart.storage.Storage;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long productId;
    private String productType;
    private String category;
    private String description;
    private BigDecimal productPrice;
    private BigDecimal unitCost;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Storage> storage = new ArrayList<>();
    Product() {
    }

    public Product(String productType, String category, BigDecimal productPrice, String description, BigDecimal unitCost) {
        this.productType = productType;
        this.description = description;
        this.productPrice = productPrice;
        this.unitCost = unitCost;
        this.category = category;
    }


    public Long getProductId() {
        return productId;
    }

    public String getProductType() {
        return productType;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productId +
                ", productType='" + productType + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", productPrice=" + productPrice +
                ", unitCost=" + unitCost +
                '}';
    }
}
