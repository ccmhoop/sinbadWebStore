package com.SimbadMart.maven.simbadMart.ShopCart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShopCartRepository extends JpaRepository<ShopCart,Long> {
    Optional<ShopCart> findByCustomerId(Long customerId);
}
