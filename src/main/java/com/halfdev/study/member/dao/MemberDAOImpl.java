package com.halfdev.study.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.halfdev.study.member.vo.JoinOKVO;
import com.halfdev.study.member.vo.JoinVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	SqlSession session;
	
	@Override
	public void insertMember(JoinVO joinVO) {
		session.insert("member.insertMember", joinVO);
	}

	@Override
	public int dupliCheckId(String checkId) {
		int cnt = session.selectOne("dupliCheckId", checkId.replace("=", ""));
		return cnt;
	}

	@Override
	public boolean loginCheck(JoinOKVO joinOKVO) {
		String check = session.selectOne("loginCheck", joinOKVO);
		return (check == null) ? false : true;
	}



}
