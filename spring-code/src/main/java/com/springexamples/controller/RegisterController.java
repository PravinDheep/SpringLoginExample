package com.springexamples.controller;
//import com.formsdirect.service.UserService;
//import com.formsdirect.delegate.LoginDelegate;
//import java.sql.SQLException;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.springexamples.service.UserServiceImpl;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RegisterController {
	
	@RequestMapping(value="/registration" , method = RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("msg", "Hi..Welcome to Spring Framework..");
		return "register";
	}
	
	@RequestMapping(value="/registration" , method = RequestMethod.POST)
	public String print(ModelMap model){
		model.addAttribute("msg", "Hi..Welcome to Spring Framework..");
		return "register";
	}
	
	@RequestMapping(value="login" , method=RequestMethod.GET)
	public ModelAndView displayLoginPage(@ModelAttribute("loginCheck")UserServiceImpl UserServiceImpl){
		ModelAndView model = new ModelAndView("/login");
		System.out.println("I am from displayLoginPage");
		return model;
	}
	
	@RequestMapping(value="login" , method=RequestMethod.POST)
	public ModelAndView displayLogin(@ModelAttribute("loginCheck")UserServiceImpl UserServiceImpl){
		ModelAndView model = new ModelAndView("login"); 
		return model;
	}	
	
	@RequestMapping(value="result" , method=RequestMethod.POST)
	public ModelAndView displayResult(@ModelAttribute("loginCheck")UserServiceImpl UserServiceImpl){
		    String resultText = "Your Login Status";
		    ModelAndView model = new ModelAndView("login","messageText",resultText);
       try{
			String isValidUser;
			isValidUser = UserServiceImpl.getUserName();
			if(isValidUser.equals("admin"))
			{
			model = new ModelAndView("welcome" , "loggedInUser", UserServiceImpl.getUserName());
            System.out.println("User Login Successful");
            return model;
            }else {			
			model = new ModelAndView("failure" , "message", "Invalid Credentials");
			System.out.println("Invalid UserName or Password.");
			return model;
		    }	
	    }
		catch(Exception e){
			e.printStackTrace();
		}
       		return model;
}
}