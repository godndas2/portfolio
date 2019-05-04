package com.halfdev.study.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halfdev.study.board.dao.BoardDAO;
import com.halfdev.study.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardVO> boardList(BoardVO boardVO) {
		return boardDao.boardList(boardVO);
	}

	@Override
	public void boardInsert(BoardVO boardVO) {
		boardDao.boardInsert(boardVO);
	}

	@Override
	public BoardVO boardRead(String nno) {
		return boardDao.boardRead(nno);
	}

}
