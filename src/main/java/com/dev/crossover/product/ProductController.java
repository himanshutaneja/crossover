package com.dev.crossover.product;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getAll() {
		return null;
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public int add(@RequestBody Product product) {
		return 0;
	}
}
