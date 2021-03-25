package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.Book;
import com.example.demo.dao.BookRepository;

@Controller
@ConfigurationProperties(prefix="amazon")
public class BookController {
	
	private String associateId;
	
	public String getAssociateId() {
		return associateId;
	}


	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}


	public BookRepository getBookRepository() {
		return bookRepository;
	}


	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Autowired
	private BookRepository bookRepository;	
	
	@GetMapping("/book/{author}")
	public String getAuthorDetaiks(@PathVariable("author") String reader, Model model) {
		List<Book> booksList = bookRepository.findByReader(reader);
		System.out.println(booksList.size());
		model.addAttribute("books", booksList);
		model.addAttribute("amazonId", associateId);
		return "booksList.html";
	}
	
	
	@GetMapping(value= "/login")
	public String getLoginPage(Model model) {
		return "/login";
	}
	
	@GetMapping(value= "/logout-success")
	public String getLogOut(Model model) {
		return "/logout";
	}
	
	
	
}
