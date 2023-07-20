package com.SimbadMart.maven.simbadMart;

import com.SimbadMart.maven.simbadMart.product.Product;
import com.SimbadMart.maven.simbadMart.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class Seed implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        seedProduct();
    }

    public void seedProduct() {

        if (productRepository.count() == 0) {
            System.out.println(" Seeding Products");
            List<Product> products = List.of(new Product("Coca-Cola", "Lekker bruisend!", new BigDecimal(1.20), new BigDecimal(2.20)),
                    new Product("Pepsi-cola", "Beter dan Cola", new BigDecimal(1.1), new BigDecimal(2.19)),
                    new Product("Casa di Mama Komijn", "Niet erg lekker", new BigDecimal(1.2), new BigDecimal(2.5)));
            for (Product product : products) {
                productRepository.save(product);
            }
        }
        System.out.println("Now " + productRepository.count() + " in the database.");
    }

}
