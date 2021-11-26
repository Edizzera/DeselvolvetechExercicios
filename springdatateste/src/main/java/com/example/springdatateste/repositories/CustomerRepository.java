package com.example.springdatateste.repositories;

import com.example.springdatateste.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

   List<Customer> findById(long id);

}
