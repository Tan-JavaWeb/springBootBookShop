package com.springboot.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminHomeController {

	@RequestMapping({"/admin", "/admin/index", "/admin/home"})
	public String AdminHomePage(Model model) {
		return "admin/home";
	}
}
