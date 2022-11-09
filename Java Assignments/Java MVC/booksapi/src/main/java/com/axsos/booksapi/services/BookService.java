package com.axsos.booksapi.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.booksapi.models.Book;
import com.axsos.booksapi.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
	private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Book eBook = findBook(id);
			eBook.setTitle(title);
			eBook.setDescription(desc);
			eBook.setLanguage(lang);
			eBook.setNumberOfPages(numOfPages);
			
			return bookRepository.save(eBook);
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}


