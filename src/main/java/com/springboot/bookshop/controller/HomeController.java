package com.springboot.bookshop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);
	
	@GetMapping(path = { "/", "/index", "home" })
	public String homePage(Model model) {
		LOGGER.info("This is home page");
		return "user/home";
	}

	@GetMapping(path = "/login")
	public String loginPage(Model model) {

		return "user/login";
	}
}
