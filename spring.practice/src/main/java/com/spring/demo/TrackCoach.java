package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Autowired
	private DietService dietService;
	
	@Value("${email}")
	private String email;
	
	@Value("${company}")
	private String company;

	
	@Override
	public String getDailyWorkOut() {

		return "Track coach ";
	}

	@Override
	public String getDailyDiet() {
		return dietService.getDiet();
	}

	public String getEmail() {
		return email;
	}

	public String getCompany() {
		return company;
	}

}
