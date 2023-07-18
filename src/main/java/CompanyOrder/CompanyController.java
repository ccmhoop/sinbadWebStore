package CompanyOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import products.Products;


@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class CompanyController {

    @Autowired
    CompanyOrderRepository companyOrderRepository;

    @PostMapping("save")
    public void saveCompanyOrder(@RequestBody CompanyOrder companyOrder) {
        companyOrderRepository.save(companyOrder);
        System.out.println("Message stored");
    }

}
