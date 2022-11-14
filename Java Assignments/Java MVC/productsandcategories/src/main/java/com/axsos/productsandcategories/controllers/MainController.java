package com.axsos.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.services.CategoryService;
import com.axsos.productsandcategories.services.ProductService;



@Controller
public class MainController {

	@Autowired
	ProductService productService;
	
	@Autowired 
	CategoryService categoryService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("products", productService.findAll());
		model.addAttribute("categories", categoryService.findAll());
		return "home.jsp";
	}
	
	
	
	@GetMapping("/products/new")
	public String viewAddProduct(@ModelAttribute("product") Product product) {
		return "new_product.jsp";
	}
	
	@PostMapping("/products/new")
	public String AddProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "new_product.jsp";
		}
		else {
			productService.createProduct(product);
			return "redirect:/";
		}
	}
	
	
	
	@GetMapping("/categories/new")
	public String viewAddCategory(@ModelAttribute("category") Category category) {
		return "new_category.jsp";
	}
	
	@PostMapping("/categories/new")
	public String AddCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "new_category.jsp";
		}
		else {
			categoryService.createCategory(category);
			return "redirect:/";
		}
	}
	
	
	
	
	
	
	
	@GetMapping("/categories/{id}")
	public String viewCategoryPage(@PathVariable("id") Long id, @ModelAttribute("category") Category category, Model model) {
		model.addAttribute("category", categoryService.findCategory(id));
		model.addAttribute("productsNotBelongToThisCategory", productService.productsNotBelongToThisCategory(categoryService.findCategory(id)));
		return "category_page.jsp";
	}
	
	@PostMapping("/categories/{categoryId}")
	public String categoryPage(@PathVariable("categoryId") Long categoryId, @RequestParam(value="productId") Long productId) {
		Category category = categoryService.findCategory(categoryId);
		Product product = productService.findProduct(productId);
		category.getProducts().add(product);
		categoryService.createCategory(category);
		return "redirect:/categories/" + categoryId;
	}
	
	
	
	
	
	
	@GetMapping("/products/{id}")
	public String viewProductPage(@PathVariable("id") Long id, @ModelAttribute("product") Product product, Model model) {
		model.addAttribute("product", productService.findProduct(id));
		model.addAttribute("categoriesNotBelongToThisProduct", categoryService.categoriesNotBelongToThisProduct(productService.findProduct(id)));
		return "product_page.jsp";
	}
	
	
	@PostMapping("/products/{productId}")
	public String productPage(@PathVariable("productId") Long productId, @RequestParam(value="categoryId") Long categoryId) {
		Category category = categoryService.findCategory(categoryId);
		Product product = productService.findProduct(productId);
		category.getProducts().add(product);
		categoryService.createCategory(category);
		return "redirect:/products/" + productId;
	}
}
