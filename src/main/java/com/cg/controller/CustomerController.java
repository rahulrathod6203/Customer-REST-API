package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl service;
	
	@GetMapping("/customer/all")
	public List<Customer> getAllCustomers(){
		return service.getAll();
	}
	
	

}
