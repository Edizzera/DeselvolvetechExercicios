package com.example.springdatateste.controller;

import com.example.springdatateste.entites.Customer;
import com.example.springdatateste.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/todos")
    public List<Customer> consultar() {
        return customerRepository.findAll();
    }

    @GetMapping("/sobrenome")
    public List<Customer> consultaSobrenome(String sobrenome) {
        return customerRepository.findByLastName(sobrenome);
    }

    @GetMapping("/{id}")
    public Optional<Customer> consultaId(@PathVariable Long id) {
        return customerRepository.findById(id);
    }
    @PostMapping
    public Customer saveCustomer(@RequestBody Customer obj) {
        obj = customerRepository.save(obj);
        return  obj;


    }
}
