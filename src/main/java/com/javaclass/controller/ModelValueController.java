package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

@Controller
public class ModelValueController {

	@Autowired
	MemberVO vo;
	
	@RequestMapping("modelValue")
	public ModelAndView test() {
		System.out.println("----- modelValue.do ");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("modelValue");
		mv.addObject("member",vo);
		//""여기이름은 내맘 membervo가 member이름으로 modelValueview페이지로 넘어감
		return mv;
	}
	
	
}
