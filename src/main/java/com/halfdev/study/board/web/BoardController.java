package com.halfdev.study.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.halfdev.study.board.service.BoardService;
import com.halfdev.study.board.vo.BoardVO;

// 주석 자동 추가 Alt + Shift + J
/**
 * @author HalfDev
 *
 */

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(BoardVO boardvo, Model model) {
		List<BoardVO> list = boardService.boardList(boardvo);
		model.addAttribute("list", list);
		return "board/boardList";
	}
	
	   @RequestMapping(value="/boardWrite", method=RequestMethod.GET)
	    public String boardWrite() {
	        return "board/boardInsert";
	    }
	    
	    @RequestMapping(value="/boardInsert", method=RequestMethod.POST)
	     public String boardInsert(BoardVO boardVO) {
	        boardService.boardInsert(boardVO);
	        return "redirect:boardList";
	    }
}
