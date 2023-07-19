package com.SimbadMart.maven.simbadMart.storage;

import com.SimbadMart.maven.simbadMart.ShopCart.ShopCart;
import com.SimbadMart.maven.simbadMart.product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Storage {
    @Id
    @GeneratedValue
    Long StorageID;
    int amount;



    Storage(){
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productid", nullable = false)
    private Product product;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "storage")
    private List<ShopCart> shopCart = new ArrayList<>();

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
