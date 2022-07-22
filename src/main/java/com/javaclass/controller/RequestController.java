package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.model.MemberVO;

@Controller
@RequestMapping("re")
public class RequestController {

	@RequestMapping(value={"/a.do","/b.do"})//이건 절대경로임 아까까지 상대경로
	public String test() {
		System.out.println("a.do 요청"); //view 페이지를 지정하지 않았기 때문에
		//404가 뜨지만 이게 잘 뜨면 여기까지 잘 왔다는 거임
		// 뷰페이지 지정 
		//모델앤뷰는 아까 데이터랑 뷰를 같이 보내겟다
		//이번에는 화면 페이지만 지정하고 싶으면
		//**********************************************
		//중요: 스프링 컨트롤러에서 매핑 함수의 리턴 값이 String인 경우는 
		//********문자열 반환이 아니라
		//******** 뷰페이지 지정
		return "home"; // -> /WEB-INF/views/ + home + .jsp
	
	}
	@RequestMapping(value="/c.do",params= {"id=kim"})
	//id=kim하면 요청 3은 들어오기 요청4는 안찍힘	
	public void test2()	{
		System.out.println("re/c.do 요청");
	//************************************************
		//스프링 컨트롤러에서 매칭 함수의 리턴값이 void인 경우는 
		//**리턴값이 없다는 신호가 아니라 
		//**자동으로 뷰페이지를 지정
		// a.do	-> /WEB-INF/views/+ a  +  .jsp
		// re/c.do ->  /WEB-INF/views/+ re / c + .jsp
	}
	
//	@RequestMapping("request.do")
//	public void test3(MemberVO vo)	{
//		System.out.println("re/request.do 요청 신호 ");
//		System.out.println(vo.getName()+"님 입력합니다.");
//	}

	@RequestMapping(value="request.do", method=RequestMethod.POST)
	public void test3(@ModelAttribute("vo") MemberVO vo)	{
		System.out.println("re/request.do 요청 신호 ");
		System.out.println(vo.getName()+"님 입력합니다.");
		
		//(request.jsp)
		//vo. 안돌아가니까 @ModelAttribute("vo") 로 돌아가게 하는 방법 
		//그리중요하지 않은
		
	}	
}

