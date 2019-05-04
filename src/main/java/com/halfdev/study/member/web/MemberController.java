package com.halfdev.study.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	// 로그인 페이지로 이동
	@RequestMapping("login")
	public String loginPage() {
		return "member/login";
	}
	// 회원가입 페이지로 이동
	@RequestMapping("join")
	public String joinPage() {
		return "member/signUp";
	}
	// 회원 로그인 체크 
	@RequestMapping("memberJoinOk")
	public String loginCheck(@ModelAttribute JoinVO joinVO,
			HttpSession session){
			String cpid = memberService.loginCheck(joinVO, session);
			ModelAndView mv = new ModelAndView();
			
			if(cpid != null) {
				mv.setViewName("main");
			}else {
				mv.setViewName("member/login");
				mv.addObject("message", "error");
			}
		return "redirect:/main";
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
