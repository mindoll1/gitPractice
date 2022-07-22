package com.javaclass.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("start.do")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");// /WEB-INF/views/ + home + .jsp
		mv.addObject("serverTime",new Date());
		return mv;
	}
	
}
