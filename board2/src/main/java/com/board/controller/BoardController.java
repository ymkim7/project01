package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.board.domain.AccountVO;
import com.board.domain.BoardVO;
import com.board.domain.Criteria;
import com.board.service.BoardService;
import com.google.gson.Gson;
import com.mysql.cj.xdevapi.JsonParser;
import com.mysql.cj.xdevapi.JsonString;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Inject
	BoardService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		
		List<BoardVO> list = null;
		list = service.list();
		
		model.addAttribute("list", list);
		
	}
	
	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWirte() throws Exception {
	   
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWirte(BoardVO vo) throws Exception {
		
		service.write(vo);
		
		return "board/list";
		
	}
	
	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("busiNum") String busiNum, Model model) throws Exception {
		BoardVO param = new BoardVO();
		param.setBusiNum(busiNum);
		BoardVO vo = service.view(param);
		
		model.addAttribute("view", vo);
		
	}
	
	//거래처 조회
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String getViewTwo(@RequestParam("busiNum") String busiNum, Model model) throws Exception {
		AccountVO param = new AccountVO();
		param.setBusiNum(busiNum);
		
		AccountVO voTwo = service.viewTwo(param);
		
		model.addAttribute("voTwo", voTwo);
		
		return "board/account";
		
	}

	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String getModify(BoardVO param, Model model) throws Exception {

		BoardVO vo = service.view(param);
	   
		model.addAttribute("view", vo);
	 
		return "board/modify";
	}
	
	// 게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("busiNum") String busiNum) throws Exception {
	  
		service.delete(busiNum);  

	return "redirect:list";
	 
	}
	
	
	//reference
	//등록문
	@ResponseBody
	@RequestMapping(value = "/insertData", method = RequestMethod.POST, produces =  "text/plain;charset=utf-8" )
	public String insertData(BoardVO vo) throws Exception {
		boolean result = false;
		
		if(null != vo) {
			service.write(vo);
			result = true;
		}
		
		String jsonStr = "{\"message\":\"" + result + "\"}";
		return jsonStr;
	}
	
	//수정문
	@ResponseBody
	@RequestMapping(value = "/modifyData", method = RequestMethod.POST, produces =  "text/plain;charset=utf-8" )
	public String  modify(BoardVO vo) throws Exception {
		boolean result = false;
		
		if(null != vo) {
			service.modify(vo);
			result = true;
		}
		
		String jsonStr = "{\"message\":\"" + result + "\"}";
		return jsonStr;
	}
	
	//검색문
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public ModelAndView listSearch(ModelAndView model
			, @RequestParam(required = false, defaultValue = "title") String searchType
			, @RequestParam(required = false) String keyword) throws Exception {
		
		//1.검색하기위해 검색어를 받아온다 그리고 setting
		Criteria search = new Criteria();
		search.setSearchType(searchType);
		search.setKeyword(keyword);
		
		//2.검색어로 글을 찾는다
		//3.찾은글을 가져온다
		List<BoardVO> list = service.listSearch(search);
		//     3                           2
		
		//4.가져온 글을 리턴한다
		//리턴해주기위해 setting
		model.addObject("list", list);
		model.setViewName("board/listPage");
		
		return model;
	}
	
}
