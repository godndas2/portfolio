package com.halfdev.study.member.service;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halfdev.study.common.LoginUtil;
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
	@Override
	public void successJoin(JoinOKVO joinOKVO) {}

	// 중복확인
	@Override
	public int dupliCheckId(String checkId) {
		int retVal = memberDAO.dupliCheckId(checkId); 
		return retVal;
	}
	
	//로그인 체크 
	@Override
	public String loginCheck(JoinVO joinVO, HttpSession session) {
		String id = memberDAO.loginCheck(joinVO);
		if(id !=null) {
			session.setAttribute("cpid", joinVO.getSignUpUserId());
			session.setAttribute("id", id);
		}
		return id;
	}
	 

}
