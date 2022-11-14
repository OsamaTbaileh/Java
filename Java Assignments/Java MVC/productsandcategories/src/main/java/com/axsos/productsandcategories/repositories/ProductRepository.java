package com.axsos.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findAll();
	
	
//	Give a list of products that have a relation to the specific category
	List<Product> findAllByCategories(Category category);
	
//	Give a list of products that dont have any relation to the specific category:
	List<Product> findByCategoriesNotContains(Category category);
	
}
