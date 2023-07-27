package com.SimbadMart.maven.simbadMart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping("save")
    public void saveProducts(@RequestBody Product product) {
        productRepository.save(product);
        System.out.println("Message stored");
    }

    @GetMapping("{productId}")
    public Optional<Product> findById(@PathVariable("productId") Long productId) {
        return productRepository.findById(productId);
    }

    @GetMapping("product")
    public List<Product> findAll() {
        return productRepository.findAll();
    }


}
