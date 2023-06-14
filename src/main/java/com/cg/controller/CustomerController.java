package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.exceptions.CustomerNotFoundException;
import com.cg.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	@Autowired
	CustomerServiceImpl service;

	@GetMapping("/customer/all")
	public List<Customer> getAllCustomers() {
		return service.getAll();
	}

	@GetMapping("/customer/{id}")
	public Optional<Customer> getById(@PathVariable("id") int id) {

		return Optional.of(service.getById(id).orElseThrow(() -> new CustomerNotFoundException(id)));
	}
	
	
	

}
