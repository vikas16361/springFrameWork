package com.vikas.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXmlConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class classArr[] = {SpringApplicationConfig.class};
		return classArr;
	}

	@Override
	protected String[] getServletMappings() {
		/* String arrMapping[] = {"/wordcount/*"}; */
		String arrMapping[] = {"/"};
		return arrMapping;
	}

}
