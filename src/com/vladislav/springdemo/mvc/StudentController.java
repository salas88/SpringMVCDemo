package com.vladislav.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("myStudent", theStudent);
		return "student-form";
	}
	
	@RequestMapping("/acsessForm")
	public String showResultStudentForm(@ModelAttribute("myStudent") Student theStudent) {
		
		return "result-page-student";
	}

}
