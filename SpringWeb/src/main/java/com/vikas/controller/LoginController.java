package com.vikas.controller;

//import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vikas.model.loginDto;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String login(Model m) {
		m.addAttribute("obj",new loginDto());
		return "login";
	}
	@RequestMapping("/login-panel")
	
	public String home(@ModelAttribute("obj") loginDto login,Model m,@RequestParam("action") String action) {
		
		System.out.println(action);
		if(action.equalsIgnoreCase("login")) {
		
		if(login.getUsername().equals("Abhi")&&login.getPassword().equals("789")) {
		return "Home";
		}else {
			m.addAttribute("msg", "invalid!!");
			return "login";
		}
		}
		else if(action.equalsIgnoreCase("Register")){
			return "redirect:/registration";
		}
		return action;
	}
	
}
