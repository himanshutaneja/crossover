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

}
