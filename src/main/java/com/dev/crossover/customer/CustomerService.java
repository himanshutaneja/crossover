package com.dev.crossover.customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getAll();

	Customer get(String code);

	void save(Customer customer);

	void delete(String code);

}
