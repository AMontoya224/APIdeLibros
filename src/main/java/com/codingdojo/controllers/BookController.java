package com.codingdojo.controllers;









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
	
	@RequestMapping( value="/books/{id}", method=RequestMethod.GET )
	public String show( @PathVariable("id") Long id, Model model ) {
		Book book = bookService.selectFromBooksWhereId(id);
		System.out.print(book.getNumOfPages());
		model.addAttribute( "book", book );
		
		return "show.jsp";
	}
}
