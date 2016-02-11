package com.dev.crossover.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> getAll() {
		return repository.findAll();
	}

	@Override
	public void save(Customer customer) {
		repository.saveAndFlush(customer);
	}

	@Override
	public Customer get(int code) {
		return repository.findOne(code);
	}

	@Override
	public void delete(int code) {
		repository.delete(code);
	}

}
