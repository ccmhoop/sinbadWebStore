package com.SimbadMart.maven.simbadMart.customer;

import com.SimbadMart.maven.simbadMart.ShopCart.ShopCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ShopCartRepository shopCartRepository;

    @PostMapping("register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        System.out.println("New " + customer.getRole() + " has been added!");
        return customerRepository.save(customer);
    }


    @GetMapping("id")
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    @GetMapping("customers")
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("{customerSurname}")
    public Optional<Customer> findByName(@PathVariable("customerSurname") String surname) {
        return customerRepository.findByCustomerSurname(surname);
    }


//    @PostMapping("customer/shop")
//    public

    @PostMapping("login")
    public ResponseEntity<Customer> loginCustomer(@RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        Optional<Customer> customer = customerRepository.findByeMail(email);

        if (customer.isPresent()) {

            Customer foundCustomer = customer.get();
            if (foundCustomer.getPassword().equals(password)) {
                return ResponseEntity.ok(foundCustomer);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}


