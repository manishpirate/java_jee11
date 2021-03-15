package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class BasicController {

	@GetMapping(value= "/login")
	public String getLoginPage(Model model) {
		return "/login";
	}
	
	@GetMapping(value= "/logout-success")
	public String getLogOut(Model model) {
		return "/logout";
	}
	
	@GetMapping(value= "/")
	public String getMainPage(Model model) {
		return "/login";
	}
	
	
}
