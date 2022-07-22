package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnController {
	@RequestMapping("modelandview.do")
	public ModelAndView test1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("void");
		mv.addObject("message", "오늘도 행복");
		return mv;
	}
	
	@RequestMapping("void.do")
	public void test2(Model m) {
		//*********************************
		//Model 함수의 인자에 작성하지만 데이타를 뷰단으로 보내는 역할을 함
		m.addAttribute("message", "오늘도 행복2번째");
	}
	
	@RequestMapping("string.do")
	public String test3(Model m) {
		m.addAttribute("message", "오늘도 행복2번째");
		return "void";
		
		
	}
	
	
}
