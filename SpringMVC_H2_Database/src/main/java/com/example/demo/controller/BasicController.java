package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class BasicController {
	
	Logger logger = LoggerFactory.getLogger(BasicController.class);

	@GetMapping(value= "/login")
	public String getLoginPage(Model model) {
		logger.info("Login page call");
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
