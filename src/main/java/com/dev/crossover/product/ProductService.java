package com.dev.crossover.product;

import java.util.List;

public interface ProductService {

	List<Product> getAll();

	Product save(Product product);

	Product get(String code);

	void delete(String code);

}
