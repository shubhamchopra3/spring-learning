package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class DailyDietService implements DietService {

	@Override
	public String getDiet() {
	
		return " maintain diet daily ";
	}

}
