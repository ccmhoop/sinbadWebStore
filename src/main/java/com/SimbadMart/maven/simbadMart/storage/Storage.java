package com.SimbadMart.maven.simbadMart.storage;

import com.SimbadMart.maven.simbadMart.ShopCart.ShopCart;
import com.SimbadMart.maven.simbadMart.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Storage {
    @Id
    @GeneratedValue
    Long StorageID;
    int amount;

    public Storage(int amount, Product product, List<ShopCart> shopCart) {
        this.amount = amount;
        this.product = product;
        this.shopCart = shopCart;
    }

    public Storage() {
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productid", nullable = false)
    @JsonBackReference
    private Product product;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "storage")
    private List<ShopCart> shopCart = new ArrayList<>();

    public List<ShopCart> getShopCart() {
        return shopCart;
    }

    public Long getStorageID() {
        return StorageID;
    }

    public int getAmount() {
        return amount;
    }


    public Product getProduct() {
        return product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
