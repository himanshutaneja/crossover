package com.dev.crossover.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getAll();
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public void add(@RequestBody Customer customer) {
	}

}
