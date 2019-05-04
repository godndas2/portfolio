package com.halfdev.study.member.service;



import javax.servlet.http.HttpServletResponse;

import com.halfdev.study.member.vo.JoinOKVO;
import com.halfdev.study.member.vo.JoinVO;

public interface MemberService {

	// 회원가입
	public void insertMember(JoinVO joinVO) throws Exception;
	// 회원 로그인
//    public void successJoin(JoinOKVO joinOKVO);
    // 중복확인
 	public int dupliCheckId(String checkId);
 	// 로그인 체크 
 	public String loginCheck(JoinVO joinVO, HttpSession session);
} 

