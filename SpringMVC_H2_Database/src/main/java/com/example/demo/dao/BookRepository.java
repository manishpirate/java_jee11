package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This book repository will be implemented by the spring Data 
 * @author manishsharma
 *
 */
public interface BookRepository extends JpaRepository<Book, Long>{

	public List<Book> findByReader(String reader);
	
}
