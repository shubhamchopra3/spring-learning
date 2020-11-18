package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
				
		//ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
		TrackCoach c = (TrackCoach) context.getBean("trackCoach");
		
		System.out.println(c.getDailyWorkOut());
		System.out.println(c.getDailyDiet());
		
		System.out.println(c.getCompany());
		System.out.println(c.getEmail());

		
		context.close();
			
	}

}
