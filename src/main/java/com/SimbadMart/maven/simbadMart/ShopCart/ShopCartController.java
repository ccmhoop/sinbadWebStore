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
    StorageRepository storageRepository;
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("save/{customerId}/{storageId}/{amount}/{customerTimesOrdered}")
    public ShopCart saveShopCart(@PathVariable("customerId") Long customerId, @PathVariable("storageId") Long storageId, @PathVariable("amount") int amount, @PathVariable("customerTimesOrdered") int customerTimesOrdered) {
       var customer = customerRepository.findById(customerId).get();
        var storage = storageRepository.findById(storageId).get();
        int storAmount = storage.getAmount() - amount;
       if (amount > 0) {
            customer.setTimesOrdered(customerTimesOrdered);
            storage.setAmount(storAmount);
            return shopCartRepository.save(new ShopCart(amount, storageRepository.findById(storageId).get(), customerRepository.findById(customerId).get(), customer.getTimesOrdered()));
        } else return null;
    }
}
