package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.AccountVO;
import com.board.domain.BoardVO;
import com.board.domain.Criteria;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	 private BoardDAO dao;
	 
	 @Override
	 public List<BoardVO> list() throws Exception {
	  return dao.list();
	  
	 }

	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
		
	}

	@Override
	public BoardVO view(BoardVO vo) throws Exception {
		return dao.view(vo);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
		
	}

	@Override
	public void delete(String bno) throws Exception {
		dao.delete(bno);
		
	}

	@Override
	public List<BoardVO> listSearch(Criteria search) throws Exception {
		return dao.listSearch(search);
	}

	@Override
	public AccountVO viewTwo(AccountVO voTwo) throws Exception {
		return dao.viewTwo(voTwo);
	}

}
