package com.halfdev.study.member.service;

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
	public void insertMember(JoinVO joinVO) {
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

}
