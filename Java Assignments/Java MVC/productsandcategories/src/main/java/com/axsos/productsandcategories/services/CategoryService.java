package com.axsos.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.repositories.CategoryRepository;

@Service 
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();			
		}
		else {
			return null;
		}
	}
	
	
	public List<Category> categoriesNotBelongToThisProduct(Product product){
		return categoryRepository.findByProductsNotContains(product);
	}
	
	
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
