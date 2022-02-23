package com.codingdojo.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	 
	Optional<Book> findById( Long id );
	
	@SuppressWarnings("unchecked")
	Book save( Book bookEncontrado ); //INSERT
	 
	 @Transactional
	 void deleteById( Long id );
	 
}
