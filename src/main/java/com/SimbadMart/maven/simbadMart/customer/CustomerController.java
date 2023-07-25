package com.SimbadMart.maven.simbadMart.customer;

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

    @PostMapping("register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        System.out.println("New " + customer.getRole() + " has been added!");
        return customerRepository.save(customer);
    }


    @GetMapping("customers")
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("{customerSurname}")
    public Optional<Customer> findByName(@PathVariable("customerSurname") String surname) {
        return customerRepository.findByCustomerSurname(surname);
    }


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


