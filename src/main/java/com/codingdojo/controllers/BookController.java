package com.codingdojo.controllers;









import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Book;
import com.codingdojo.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;
	
	public BookController( BookService bookService ) {
		this.bookService = bookService;
	}
	
	@RequestMapping( value="/books", method=RequestMethod.GET )
	public String index( Model model ) {
		List<Book> booksList = bookService.selectFromBooks();
		model.addAttribute( "booksList", booksList );
		
		return "index.jsp";
	}
	
	@RequestMapping( value="/books/{id}", method=RequestMethod.GET )
	public String show( @PathVariable("id") Long id, Model model ) {
		Book book = bookService.selectFromBooksWhereId(id);
		if( book == null) {
			System.out.print("ththth");
		}
		System.out.print(book.getNumOfPages());
		model.addAttribute( "book", book );
		
		return "show.jsp";
	}
}
