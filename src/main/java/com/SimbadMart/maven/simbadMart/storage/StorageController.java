package com.SimbadMart.maven.simbadMart.storage;

import com.SimbadMart.maven.simbadMart.product.Product;
import com.SimbadMart.maven.simbadMart.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/storage")
public class StorageController {
    @Autowired
    StorageRepository storageRepository;

    @GetMapping("all")
    public List<Storage> findAll() {
        for(Product product : storageRepository.findAll().stream().map(Storage::getProduct).toList()){
            System.out.println(product.getProductType());
        }
        return storageRepository.findAll();
    }
    @GetMapping("{productId}")
    public Optional<Storage> findByProduct(@PathVariable("productId") Product product) {
        return storageRepository.findByProduct(product);
    }

    @PostMapping("add/{productId}")
    public void addProduct(@PathVariable("productId") Product product) {
        storageRepository.save(new Storage(0, product, null));
        var storageProduct = storageRepository.findByProduct(product);
        System.out.println("\u001B[32m" + "Has been updated" + " StorageId: " + storageRepository.findByProduct(product) +
                " " + storageProduct.get().getProduct() + "\u001B[0m.");

    }

    @PostMapping("{productId}/replace/{amount}")
    public void replaceAmount(@PathVariable("productId") Product product, @PathVariable("amount") int amount) {
        var storage = storageRepository.findByProduct(product);
        if (storage.isEmpty()) {
            return;
        }

        System.out.println("\u001B[32m" + "Has been updated" + " StorageId: " + storage.get().StorageID + " " + storage.get().getProduct() + " amount: " + storage.get().amount + "\u001B[0m");
        storage.get().setAmount(amount);
        storageRepository.save(storage.get());

    }
}
