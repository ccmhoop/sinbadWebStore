package com.SimbadMart.maven.simbadMart;

import com.SimbadMart.maven.simbadMart.product.Product;
import com.SimbadMart.maven.simbadMart.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
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
        List<Product> products = new ArrayList<>();
        if (productRepository.count() == 0) {
            products.add(new Product("Apple", "Fruits", new BigDecimal("1.99"), "Fresh and delicious apples.", new BigDecimal("1.49")));
            products.add(new Product("Banana", "Fruits", new BigDecimal("0.79"), "Ripe and sweet bananas.", new BigDecimal("0.69")));
            products.add(new Product("Milk", "Dairy", new BigDecimal("2.49"), "Fresh whole milk.", new BigDecimal("2.19")));
            products.add(new Product("Bread", "Bakery", new BigDecimal("1.99"), "Soft and delicious bread.", new BigDecimal("1.79")));
            products.add(new Product("Chicken", "Meat", new BigDecimal("5.99"), "Boneless chicken breast.", new BigDecimal("5.49")));
            products.add(new Product("Eggs", "Dairy", new BigDecimal("2.29"), "Farm-fresh eggs.", new BigDecimal("1.99")));
            products.add(new Product("Yogurt", "Dairy", new BigDecimal("1.79"), "Creamy yogurt.", new BigDecimal("1.59")));
            products.add(new Product("Cucumber", "Vegetables", new BigDecimal("1.29"), "Crisp and fresh cucumber.", new BigDecimal("0.99")));
            products.add(new Product("Orange", "Fruits", new BigDecimal("0.99"), "Juicy and sweet oranges.", new BigDecimal("0.89")));
            products.add(new Product("Cheese", "Dairy", new BigDecimal("3.49"), "Aged cheddar cheese.", new BigDecimal("2.99")));
            products.add(new Product("Carrot", "Vegetables", new BigDecimal("0.89"), "Fresh and crunchy carrots.", new BigDecimal("0.69")));
            products.add(new Product("Beef", "Meat", new BigDecimal("7.99"), "Premium beef cuts.", new BigDecimal("7.29")));
            products.add(new Product("Tomato", "Vegetables", new BigDecimal("1.19"), "Ripe and juicy tomatoes.", new BigDecimal("0.99")));
            products.add(new Product("Pasta", "Pantry", new BigDecimal("1.49"), "Traditional pasta.", new BigDecimal("1.19")));
            products.add(new Product("Butter", "Dairy", new BigDecimal("2.99"), "Creamy butter.", new BigDecimal("2.49")));
            products.add(new Product("Lettuce", "Vegetables", new BigDecimal("1.49"), "Fresh lettuce leaves.", new BigDecimal("1.19")));
            products.add(new Product("Salmon", "Seafood", new BigDecimal("9.99"), "Premium salmon fillet.", new BigDecimal("8.99")));
            products.add(new Product("Rice", "Pantry", new BigDecimal("2.79"), "Long-grain rice.", new BigDecimal("2.29")));
            products.add(new Product("Onion", "Vegetables", new BigDecimal("0.79"), "Fresh onions.", new BigDecimal("0.69")));
            products.add(new Product("Grapes", "Fruits", new BigDecimal("3.49"), "Sweet and juicy grapes.", new BigDecimal("2.99")));
            products.add(new Product("Pork", "Meat", new BigDecimal("6.99"), "Tender pork chops.", new BigDecimal("6.49")));
            products.add(new Product("Potato", "Vegetables", new BigDecimal("0.99"), "Fresh potatoes.", new BigDecimal("0.79")));
            products.add(new Product("Mango", "Fruits", new BigDecimal("2.99"), "Ripe and succulent mango.", new BigDecimal("2.49")));
            products.add(new Product("Cereal", "Breakfast", new BigDecimal("3.99"), "Healthy cereal.", new BigDecimal("3.29")));
            products.add(new Product("Broccoli", "Vegetables", new BigDecimal("1.99"), "Fresh broccoli.", new BigDecimal("1.79")));
            products.add(new Product("Watermelon", "Fruits", new BigDecimal("4.99"), "Sweet and refreshing watermelon.", new BigDecimal("3.99")));
            products.add(new Product("Juice", "Beverages", new BigDecimal("2.49"), "100% natural fruit juice.", new BigDecimal("1.99")));
            products.add(new Product("Spinach", "Vegetables", new BigDecimal("1.79"), "Fresh spinach leaves.", new BigDecimal("1.59")));
            for (Product product : products) {
                productRepository.save(product);
            }
            System.out.println("Seeded: " + productRepository.count());
        }
    }
}

