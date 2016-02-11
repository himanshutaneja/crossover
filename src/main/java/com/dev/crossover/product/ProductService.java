package com.dev.crossover.product;

import java.util.List;

public interface ProductService {

	List<Product> getAll();

	Product save(Product product);

	Product get(int code);

	void delete(int code);

}
