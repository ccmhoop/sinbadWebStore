package com.SimbadMart.maven.simbadMart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("product")
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
