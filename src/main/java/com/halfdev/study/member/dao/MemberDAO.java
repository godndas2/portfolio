package com.halfdev.study.member.dao;

import com.halfdev.study.member.vo.JoinVO;

public interface MemberDAO {

	// 회원가입
	public void insertMember(JoinVO joinVO);

	// 중복확인
	public int dupliCheckId(String checkId);
}
