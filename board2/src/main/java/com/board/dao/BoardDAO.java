package com.board.dao;

import java.util.List;

import com.board.domain.AccountVO;
import com.board.domain.BoardVO;
import com.board.domain.Criteria;

public interface BoardDAO {
	
	public List list() throws Exception;
	
	// 게시물 작성
	public void write(BoardVO vo) throws Exception;

	// 게시물 조회
	public BoardVO view(BoardVO vo) throws Exception;
	
	// 거래처 조회
	public AccountVO viewTwo(AccountVO voTwo) throws Exception;
		
	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
	
	// 게시뮬 삭제
	public void delete(String bno) throws Exception;
	
	// 게시물 검색
	public List<BoardVO> listSearch(Criteria search) throws Exception;
	
}
