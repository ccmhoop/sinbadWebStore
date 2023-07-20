package com.SimbadMart.maven.simbadMart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

//    @PostMapping("save")
//    public void saveProducts(@RequestBody Products products) {
//        productsRepository.save(products);
//        System.out.println("Message stored");
//    }

    @GetMapping("product")
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
