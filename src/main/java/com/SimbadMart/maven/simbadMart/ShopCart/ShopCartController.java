package com.SimbadMart.maven.simbadMart.ShopCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ShopCartController {

    @Autowired
    ShopCartRepository shopCartRepository;

}
