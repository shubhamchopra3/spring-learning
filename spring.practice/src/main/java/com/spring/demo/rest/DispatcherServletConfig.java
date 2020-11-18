package com.spring.demo.rest;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.spring.demo.ApplicationContextConfig;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	// here give reference to applicationContext config class
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ApplicationContextConfig.class};
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
