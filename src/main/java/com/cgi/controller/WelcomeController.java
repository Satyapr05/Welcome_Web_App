package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public  ModelAndView diplayWelcomeMsg() {
		System.out.println("Inside method");
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("msg", "welcome to CGI, Bangalore");
	    mav.setViewName("index");
		return mav;

	}
}
