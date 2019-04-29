package com.halfdev.study.board.service;

import java.util.List;

import com.halfdev.study.board.vo.BoardVO;

public interface BoardService {

	// 게시글 목록
	public List<BoardVO> boardList(BoardVO boardVO);
	
	// 게시글 저장
	public void boardInsert(BoardVO boardVO);
}
