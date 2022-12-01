package com.masai.productService;

import java.util.List;
import java.util.Optional;

import com.masai.model.Product;

public interface ProductService {
	Product save(Product product);

	Optional<Product> findById(Integer id);

	List<Product> findAll();

	void deleteById(Integer id);
}