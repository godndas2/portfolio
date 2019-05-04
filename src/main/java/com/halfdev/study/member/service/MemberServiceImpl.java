package com.halfdev.study.member.service;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halfdev.study.member.dao.MemberDAO;
import com.halfdev.study.member.vo.JoinOKVO;
import com.halfdev.study.member.vo.JoinVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public void insertMember(JoinVO joinVO) throws Exception {
//		String encode_pwd = LoginUtil.encryptPassword(joinVO.getSignUpUserId(),joinVO.getSignUpUserPwd());
//		joinVO.setSignUpUserId(encode_pwd);
		memberDAO.insertMember(joinVO);
	}

	// 로그인
//	@Override
//	public void successJoin(JoinOKVO joinOKVO) {}

	// 중복확인
	@Override
	public int dupliCheckId(String checkId) {
		int retVal = memberDAO.dupliCheckId(checkId); 
		return retVal;
	}

	// 로그인 체크
	@Override
	public JoinVO loginCheck(JoinVO joinVO, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// 등록된 아이디가 없으면
		if(memberDAO.dupliCheckId(joinVO.getSignUpUserId()) == 0) {
			out.println("<script>");
			out.println("alert('등록된 아이디가 없습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return null;
		} else {
			String pw = joinVO.getSignUpUserPwd();
			joinVO = memberDAO.loginCheck(joinVO.getSignUpUserId());
			// 비밀번호가 다를 경우
			if(!joinVO.getSignUpUserPwd().equals(pw)) {
				out.println("<script>");
				out.println("alert('비밀번호가 다릅니다.');");
				out.println("history.go(-1);");
				out.println("</script>");
				out.close();
				return null;
			}
			return joinVO;
		}
	}
	

}
