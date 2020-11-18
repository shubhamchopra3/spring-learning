package com.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/form")
	public String showPage()
	{
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String showPage(@RequestParam("name") String name, Model model)
	{
		
		String message = "hello "+name+" how are you ?";
		
		model.addAttribute("message",message);
		
		return "confirmation";
	}

}
