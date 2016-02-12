package com.dev.crossover.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getAll();
	}

	@RequestMapping(value = "/customers/{code}", method = RequestMethod.GET)
	public Customer get(@PathVariable String code) {
		return customerService.get(code);
	}

	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void save(@RequestBody Customer customer) {
		customerService.save(customer);
	}

	@RequestMapping(value = "/customers/{code}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable String code) {
		customerService.delete(code);
	}

}
