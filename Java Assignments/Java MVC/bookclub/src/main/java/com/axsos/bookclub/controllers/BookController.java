package com.axsos.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.bookclub.models.Book;
import com.axsos.bookclub.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
   
	@GetMapping("/books/new")
	public String viewAddBook(@ModelAttribute("newBook") Book book, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
    	}
		return "add_book.jsp";
	}
	
	@PostMapping("/books/new")
	public String addBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "add_book.jsp";
		}
		else {
			bookService.createBook(book);
			return "redirect:/";
		}
	}
	
	
	
	@GetMapping("/books/{id}")
	public String viewBook(@PathVariable("id") Long id, Model model, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
			return "redirect:/";
    	}
		model.addAttribute("book", bookService.findBook(id));
		return "view_book.jsp";
	}
	
	
	@GetMapping("/books/{id}/edit")
	public String viewEditBook(@PathVariable("id") Long id, Model model, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
			return "redirect:/";
    	}
		model.addAttribute("newBook", bookService.findBook(id));
		return "edit_book.jsp";
	}
	
	
	
	@PutMapping("/books/{id}/edit")
	public String update(@Valid @ModelAttribute("newBook") Book book, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "edit_book.jsp";
		}
		else {
			bookService.createBook(book);
			return "redirect:/books/"+id;
		}
	}
	
	
	
//	@PutMapping("/books/{id}")
//	public String update(@Valid @ModelAttribute("thisBook") Book book,
//			BindingResult result, @PathVariable("id") Long id) {
//		if (result.hasErrors()) {
//			return "edit_book.jsp";
//		} else {
//			bookService.createBook(book);
//			return "redirect:/books/" + id;
//		}
//	}
	
	
	@GetMapping("/books/{id}/delete")
	public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
			return "redirect:/";
    	}
    	Book book = bookService.findBook(id);
    	if(session.getAttribute("userId")==book.getUser().getId()) {
    	bookService.deleteBook(id);
    	}
    	return "redirect:/books";
	}
}
