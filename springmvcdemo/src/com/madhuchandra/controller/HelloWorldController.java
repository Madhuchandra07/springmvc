package com.madhuchandra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
@RequestMapping ("/hello")
	public ModelAndView helloworld() {
		String message = "Hi welcome to spring MVC";
		return new ModelAndView("hellopage", "message", message);

	}

}
