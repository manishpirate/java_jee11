package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.Book;
import com.example.demo.dao.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;	
	
	@GetMapping("/book/{author}")
	public String getAuthorDetaiks(@PathVariable("author") String reader, Model model) {
		List<Book> booksList = bookRepository.findByReader(reader);
		System.out.println(booksList.size());
		model.addAttribute("books", booksList);
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
