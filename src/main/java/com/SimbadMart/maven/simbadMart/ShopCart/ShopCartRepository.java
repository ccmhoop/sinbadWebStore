package com.SimbadMart.maven.simbadMart.ShopCart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopCartRepository extends JpaRepository<ShopCart,Long> {
}
