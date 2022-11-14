package com.axsos.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	List<Category> findAll();
	
	
//	Give a list of categories that have a relation to the specific product
	List<Category> findAllByProducts(Product product);

//	Give a list of categories that dont have any relation to the specific product:
	List<Category> findByProductsNotContains(Product product);
	
}
