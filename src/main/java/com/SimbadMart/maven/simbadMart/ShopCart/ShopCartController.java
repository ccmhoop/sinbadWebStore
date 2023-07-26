package com.SimbadMart.maven.simbadMart.ShopCart;

import com.SimbadMart.maven.simbadMart.customer.CustomerRepository;
import com.SimbadMart.maven.simbadMart.storage.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/shop")
public class ShopCartController {

    @Autowired
    ShopCartRepository shopCartRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    StorageRepository storageRepository;
    @PostMapping("save/{customerId}/{storageID}/{amount}")
    public ShopCart saveShopCart(@PathVariable("customerId") Long customerId, @PathVariable("storageID") Long storageID, @PathVariable("amount")  int amount) {
        return shopCartRepository.save(new ShopCart(amount,storageRepository.findById(storageID).get() ,customerRepository.findById(customerId).get()));
    }

//    @PostMapping("save")
//    public ShopCart saveShopCart(@RequestBody ShopCart shopCart)
//    { return shopCartRepository.save(shopCart); }

}
