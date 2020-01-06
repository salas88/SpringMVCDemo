package com.vladislav.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloFormController {
	
	@RequestMapping("/form")
	public String showFormPage() {
		return "form-page";
	}
	
	@RequestMapping("/processForm")
	public String showFormResult() {
		return "form-result";
	}
	

}
