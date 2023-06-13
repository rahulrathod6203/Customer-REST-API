package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.entity.Customer;

public interface CustomerSerivce {

	public List<Customer> getAll();

	public Optional<Customer> getById(int id);

	public Customer addNewCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public void deleteCustomer(int id);

}
