package com.dev.crossover.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> getAll() {
		return repository.findAll();
	}

	@Override
	public Product save(Product product) {
		return repository.saveAndFlush(product);
	}

	@Override
	public Product get(int code) {
		return repository.findOne(code);
	}

	@Override
	public void delete(int code) {
		repository.delete(code);
	}

}
