package com.SimbadMart.maven.simbadMart.storage;

import com.SimbadMart.maven.simbadMart.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface StorageRepository extends JpaRepository<Storage, Long> {
    List<Storage> findAll();

    Optional<Storage> findByProduct(Product product);

}
