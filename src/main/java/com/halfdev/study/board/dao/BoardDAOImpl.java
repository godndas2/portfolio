package com.halfdev.study.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.halfdev.study.board.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	SqlSession session;
	
	@Override
	public List<BoardVO> boardList(BoardVO boardVO) {
		return session.selectList("board.boardList", boardVO);
	}

	@Override
	public void boardInsert(BoardVO boardVO) {
		session.insert("board.boardInsert", boardVO);
	}

	@Override
	public BoardVO boardRead(String nno) {
		return session.selectOne("board.boardRead", nno);
	}

}
