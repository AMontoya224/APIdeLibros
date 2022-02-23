package com.codingdojo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
	
	@SuppressWarnings("unchecked")
	Book save( Book bookEncontrado ); //INSERT
	
	@Transactional
	void deleteById( Long id );
	
	List<Book> findByid( Long id );
	 
}
