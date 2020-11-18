package com.spring.mvc.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>  {
	
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
	
		this.coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		
		
		return code.startsWith(coursePrefix);
		
	
	}

}
