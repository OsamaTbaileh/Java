package com.axsos.booksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.booksapi.models.Book;
import com.axsos.booksapi.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/books/{id}")
	public String viewShow(Model model, @PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		if (book !=null) {	
			model.addAttribute("bookOnTemp", book);
			return "show.jsp";
		}
		else {
			return "redirect:/books";
		}
	}
	
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("booksOnTemp", books);
        return "index.jsp";
    }

	
}
