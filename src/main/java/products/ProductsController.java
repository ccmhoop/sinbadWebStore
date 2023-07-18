package products;

import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductsController {
    @Autowired
    ProductsRepository productsRepository;

    @PostMapping("save")
    public void saveProductsController(@RequestBody Products products) {
        productsRepository.save(products);
        System.out.println("Message stored");
    }
}
