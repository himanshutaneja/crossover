package com.dev.crossover.product;

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
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getAll() {
		return productService.getAll();
	}

	@RequestMapping(value = "/products/{code}", method = RequestMethod.GET)
	public Product get(@PathVariable String code) {
		return productService.get(code);
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void save(@RequestBody Product product) {
		productService.save(product);
	}

	@RequestMapping(value = "/products/{code}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable String code) {
		productService.delete(code);
	}
}
