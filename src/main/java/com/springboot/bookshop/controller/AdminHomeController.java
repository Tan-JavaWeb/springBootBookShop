package com.springboot.bookshop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminHomeController {

	private static final Logger LOGGER = LogManager.getLogger(AdminHomeController.class);
	
	@RequestMapping({"/admin", "/admin/index", "/admin/home"})
	public String AdminHomePage(Model model) {

		return "admin/home";
	}
}
