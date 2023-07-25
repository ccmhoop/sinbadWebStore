package com.SimbadMart.maven.simbadMart.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAll();
    Optional<Customer> findByCustomerSurname(String surname);
    Optional<Customer> findByeMail(String email);
}
