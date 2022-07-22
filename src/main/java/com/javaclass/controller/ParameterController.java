package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller
public class ParameterController {

//	@RequestMapping(value="/paramForm")
//	public void test(MemberVO vo) {
//		System.out.println("paramForm.jsp 요청");
//		System.out.println(vo.getAge()+"==>나이 출력");
//	}
//	
//	@RequestMapping(value="/param.do",params= {"id=111","age=20"})
//	public void paramTwoClick() {
//		System.out.println("요청 파라메터 2개");
//		}

	@RequestMapping("param.do")
	//public void test(int id, int age) {
	public void test(MemberVO vo) {
		System.out.println("클라이언트부터 넘어오는 파라미터");
		//System.out.println(id + age);
		System.out.println(vo.getId() +" / "+ vo.getAge());
	}
	
	@RequestMapping("paramForm.do")
	//**********************
	// 스프링에서 session처리는 함수의 파라미터로 HttpSession을 지정만 하면된다.
	public void paramForm(MemberVO memberVO, HttpSession session) {
		//*********************************
		//실제로는 디비에 있는 아이디와 비밀번호를 검색을 해야됨
		int dbId = 1234;
		String dbPwd = "sky";
		
		//비교
		if(dbId == memberVO.getId() && dbPwd.equals(memberVO.getName())) {
			System.out.println("로그인성공");
			session.setAttribute("login", dbId);
		}
		
	}

}
