package com.vladislav.springdemo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "mein-menu";
	}
}
