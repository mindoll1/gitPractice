package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	
	@RequestMapping("insert.do")
	public String insert() {
		System.out.println("insert.do 요청");
	//****************************
		//사용자의 요청(url)을 변경 -> redirect 
		//insert.do url 뜨는걸 select.do로 바꾸고 페이지 바꾸는거
		return "redirect:select.do";
	
	}
	
	@RequestMapping("select.do")
	public void select() {
		System.out.println("select.do 요청");
	}
	
	/*jsp에서
	 * 	redirect 과 foward 차이
	 * 		
	 */
	
}
