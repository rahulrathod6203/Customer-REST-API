package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.Customer;
import com.cg.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerSerivce {

	@Autowired
	CustomerRepo repo;

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Customer> getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Customer addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
		
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
