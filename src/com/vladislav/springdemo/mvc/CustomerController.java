package com.vladislav.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmer);
	}
	
	@RequestMapping("/showForm")
	public String showFormCustomer(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String showResult(@Valid
			@ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) 
			return "customer-form";
		else 
			return "customer-confirmation";
	}
	

}
