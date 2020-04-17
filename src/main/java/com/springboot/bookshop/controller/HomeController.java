package com.springboot.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(path = {"/", "/index", "home"})
	public String HomePage(Model model) {

		return "user/home";
	}
}
