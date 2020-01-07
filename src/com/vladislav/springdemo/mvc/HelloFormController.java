package com.vladislav.springdemo.mvc;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloFormController {
	
	@RequestMapping("/form")
	public String showFormPage() {
		return "form-page";
	}
	
	@RequestMapping("/processForm")
	public String showFormResult(
			@RequestParam("studentName") String param, Model theModel) {
				
		String result = ("Hi " + param).toUpperCase();
		
		theModel.addAttribute("message", result);
		
		return "form-result";
	}
	

}
