package com.SimbadMart.maven.simbadMart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
}
