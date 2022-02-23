package com.codingdojo.services;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Book;
import com.codingdojo.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService( BookRepository bookRepository ) {
		this.bookRepository = bookRepository;
	}
	
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book bookEncontrado = bookRepository.findById(id).get();
		bookEncontrado.setTitle(title);
		bookEncontrado.setDesc(desc);
		bookEncontrado.setLang(lang);
		bookEncontrado.setNumOfPages(numOfPages);
		return bookRepository.save(bookEncontrado);
		
	}
	
	public void deleteFromBooks( Long id ) {
		bookRepository.deleteById(id);
	}
}
