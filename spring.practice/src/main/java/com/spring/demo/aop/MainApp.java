package com.spring.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.ApplicationContextConfig;

public class MainApp {

	public static void main(String[] args) {
				
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		
		accountDao.findAccounts();
				
		context.close();
			
	}

}
