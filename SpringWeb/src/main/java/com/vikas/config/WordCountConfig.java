package com.vikas.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WordCountConfig {//implements WebApplicationInitializer {
	
	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//XmlWebApplicationContext webAc = new XmlWebApplicationContext();
		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
		//webAc.setConfigLocation("classpath:appConfig.xml");
		wac.register(SpringApplicationConfig.class);
		
		//create ds
		 DispatcherServlet ds =new DispatcherServlet(webAc); 
		DispatcherServlet ds =new DispatcherServlet(wac);
		//register ds
		ServletRegistration.Dynamic serv =servletContext.addServlet("MYDS", ds);
		serv.setLoadOnStartup(1);
		serv.addMapping("/wordcount.com/*");*/
	}


