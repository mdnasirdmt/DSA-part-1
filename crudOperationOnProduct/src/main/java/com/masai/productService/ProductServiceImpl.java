package com.masai.productService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Product;
import com.masai.productRepo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save(Product product) {

		return productRepository.save(product);
	}

	@Override
	public Optional<Product> findById(Integer id) {

		return productRepository.findById(id);
	}

	@Override
	public List<Product> findAll() {

		return productRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		
		productRepository.deleteById(id);

	}

}
