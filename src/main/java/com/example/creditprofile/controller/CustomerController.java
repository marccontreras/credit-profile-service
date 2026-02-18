package com.example.creditprofile.controller;

import com.example.creditprofile.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private final List<Customer> customers;

    public CustomerController() {
        this.customers = new ArrayList<>();
        // Initialize with some sample data
        customers.add(new Customer(1L, "Alice", 750));
        customers.add(new Customer(2L, "Bob", 680));
        customers.add(new Customer(3L, "Charlie", 820));
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}