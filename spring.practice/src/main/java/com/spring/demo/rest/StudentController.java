package com.spring.demo.rest;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
		
	@GetMapping("/students/{id}")
	public Student getStudents(@PathVariable int id)
	{
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "shubham", "chopra", true));
		
		if(id > list.size() || id<0)
			throw new StudentNotFoundException("student not found");
			
		return list.get(id);
		
	}
	
	
	
	
	

}
