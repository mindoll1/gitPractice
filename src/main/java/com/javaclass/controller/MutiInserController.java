package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;
import com.javaclass.model.MemberVOList;

@Controller
public class MutiInserController {

	@RequestMapping("multiInsert.do")
	public void test(MemberVOList memberVOList) {
		for(MemberVO vo :memberVOList.getList()) {
		System.out.println(vo.isState() + "/" + vo.getId() + "/" + vo.getName() 
		 + "/" + vo.getAge());	
		}
	}
	
	
}
