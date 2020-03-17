package com.board.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.AccountVO;
import com.board.domain.BoardVO;
import com.board.domain.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sql;
	 
	private static String namespace = "com.board.mappers.board";

	 // 게시물 목록
	 @Override
	public List<BoardVO> list() throws Exception { 
		 return sql.selectList(namespace + ".list");
	  
	 }

	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
		
	}
	
	@Override
	public BoardVO view(BoardVO vo) throws Exception {
		return sql.selectOne(namespace + ".view", vo);
		
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
		
	}

	@Override
	public void delete(String bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
		
	}

	@Override
	public List<BoardVO> listSearch(Criteria search) throws Exception {
		return sql.selectList(namespace + ".listSearch", search);
	}

	@Override
	public AccountVO viewTwo(AccountVO voTwo) throws Exception {
		return sql.selectOne(namespace + ".viewTwo", voTwo);
	}

}
