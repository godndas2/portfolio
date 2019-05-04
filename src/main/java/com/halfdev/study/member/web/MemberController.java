package com.halfdev.study.member.web;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.halfdev.study.member.service.MemberService;
import com.halfdev.study.member.vo.JoinVO;

/**
 * @author HalfDev
 *
 */
@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// 회원가입 페이지로 이동
	@RequestMapping("join")
	public String joinPage() {
		return "member/signUp";
	}

	// 로그인 페이지로 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginPage() throws Exception {
		return "member/login";
	}
	
	// 로그인 처리하는 부분
    @RequestMapping(value="/loginSuccess",method=RequestMethod.POST)
    public String loginCheck(@ModelAttribute JoinVO joinVO, HttpSession session, HttpServletResponse response) throws Exception{
    	joinVO = memberService.loginCheck(joinVO, response);
    	session.setAttribute("joinVO", joinVO);
    	return "redirect:/main";
    }
    
    // 로그아웃 하는 부분
    @RequestMapping(value="/logout.do")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 초기화
        return "redirect:/login"; // 로그아웃 후 로그인화면으로 이동
    }
    
	// 회원가입
	@RequestMapping("memberJoin")
	public String SubmitJoin(JoinVO joinVO) throws Exception {
		memberService.insertMember(joinVO);
		return "redirect:/main"; 
	}
	
	// 중복확인
	@RequestMapping("dupliCheckId")
	@ResponseBody
	public String dupliCheckId(@RequestBody String checkId) {
		
		String checkRst;
		
		int cnt = memberService.dupliCheckId(checkId);
		if(cnt > 0) 
			checkRst = "failed";
		else 
			checkRst = "success";
		
		return checkRst;
	}
	
}
