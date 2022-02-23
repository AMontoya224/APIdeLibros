package com.codingdojo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Book;
import com.codingdojo.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService( BookRepository bookRepository ) {
		this.bookRepository = bookRepository;
	}
	
	public Book updateBook(Long id, String title, String descr, String lang, Integer numOfPages) {
		Book bookEncontrado = bookRepository.findById(id).get();
		bookEncontrado.setTitle(title);
		bookEncontrado.setDesc(descr);
		bookEncontrado.setLang(lang);
		bookEncontrado.setNumOfPages(numOfPages);
		return bookRepository.save(bookEncontrado);
		
	}
	
	public void deleteFromBooks( Long id ) {
		bookRepository.deleteById(id);
	}
	
	public Book selectFromBooksWhereId( Long id ) {
		List<Book> bookEncontrado = bookRepository.findByid(id);
		if ( bookEncontrado.isEmpty() ) {
			return null;
		}
		else {
			return bookEncontrado.get(0);
		}
	}
	
	public Book selectFromBooks() {
		List<Book> bookEncontrado = bookRepository.findAll();
		return bookEncontrado.get(0);
	}
}
