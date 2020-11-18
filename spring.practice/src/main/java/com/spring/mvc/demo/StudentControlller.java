package com.spring.mvc.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentControlller {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student s = new Student("shubham","chopra");
		model.addAttribute("student",s);

		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors())
			return "studentForm";
		
		
		return "student-confirmation";
		
	}

}
