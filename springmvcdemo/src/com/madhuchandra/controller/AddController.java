package com.madhuchandra.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/Add")
	public ModelAndView addNumbers(HttpServletRequest request , HttpServletResponse response){
		int i=Integer.parseInt(request.getParameter("fnumber"));
		int j=Integer.parseInt(request.getParameter("snumber"));
		int k=i+j;
		ModelAndView model=new ModelAndView();
		model.addObject("sum", k);
		model.setViewName("add");
		
		
		return model;
		
	}

}
