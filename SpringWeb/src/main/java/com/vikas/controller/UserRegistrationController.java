package com.vikas.controller;

import java.util.*;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vikas.model.UserDto;
import com.vikas.model.loginDto;
import com.vikas.service.UserService;

@Controller
public class UserRegistrationController {
	@Autowired
	UserService service;
	@RequestMapping("/registration")
	public String register(@ModelAttribute("objreg") UserDto reg) {
		return "register";
	}
	@ModelAttribute("countryList")
	public Map<String,String> countries(){
		//get db
		Map<String,String> map = new HashMap<String,String>();
		map.put("IND","India");
		map.put("PAK","Paksitan");
		map.put("BAN","Bangladesh");
		map.put("SRL","SriLanka");
		map.put("CHN","China");
		return map;
	}
	@RequestMapping("/processRegistration")
	public ModelAndView process(@ModelAttribute("objreg") UserDto user) {
		System.out.println("Hiiii....");
		if(service.registrationUser(user)){
			return new ModelAndView("login","obj",new loginDto());
		}
		return new ModelAndView("register","objreg",new UserDto("failed !!"));
	}
}
