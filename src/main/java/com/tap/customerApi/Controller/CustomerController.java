package com.tap.customerApi.Controller;

import com.tap.customerApi.Entity.Customer;
import com.tap.customerApi.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repo;
    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        List<Customer> customers= repo.findAll();
        return customers;
    }
}
