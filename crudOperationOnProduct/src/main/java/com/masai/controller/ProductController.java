package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.ResourseNotFound;
import com.masai.model.Product;
import com.masai.productService.ProductService;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getProductList(@RequestParam String consumerKey) {
//		log.info("Consumer: {}", consumerKey);
		return productService.findAll();
	}

	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable(value = "productId") Integer productId) {
		return productService.findById(productId)
				.orElseThrow(() -> new ResourseNotFound("productId " + productId + " not found"));
	}

	@PostMapping("/products")
	public String createProduct(@RequestBody Product product) {
		productService.save(product);
		return "Product added";
	}

	@PutMapping("/products/{productId}")
	public String updateProduct(@PathVariable(value = "productId") Integer productId, @RequestBody Product product) {
		return productService.findById(productId).map(p -> {
			p.setName(product.getName());
			p.setPrice(product.getPrice());
			productService.save(p);
			return "Product updated";
		}).orElseThrow(() -> new ResourseNotFound("productId " + productId + " not found"));
	}

	@DeleteMapping("/products/{productId}")
	public String deleteProduct(@PathVariable(value = "productId") Integer productId) {
		return productService.findById(productId).map(p -> {
			productService.deleteById(productId);
			return "Product deleted";
		}).orElseThrow(() -> new ResourseNotFound("productId " + productId + " not found"));
	}
}
