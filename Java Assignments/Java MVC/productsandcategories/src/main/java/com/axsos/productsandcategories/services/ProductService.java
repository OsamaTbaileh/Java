package com.axsos.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();			
		}
		else {
			return null;
		}
	}
	
	
	
	public List<Product> productsNotBelongToThisCategory(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
	
	
	
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
}
