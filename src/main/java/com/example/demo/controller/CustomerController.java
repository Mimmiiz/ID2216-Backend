package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired private CustomerService customerService; 

    @GetMapping("/customers")
    public Customer getCustomer(@RequestParam(value = "id") Integer id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/customers-all")
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping("/customers-post")
    public void save(@RequestBody Customer customer){
        customerService.save(customer);
    }
}
