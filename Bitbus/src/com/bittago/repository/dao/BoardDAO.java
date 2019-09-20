package com.bittago.repository.dao;

import java.util.List;

import com.bittago.repository.vo.Board;

public interface BoardDAO {

	public List<Board> selectBoard();	
	public Board selectOneBoard(int no);	
	public int insertBoard(Board board);
	public int updateBoard(Board board);
	public int updateViewCount(int no);
	public int deleteBoard(int no); 
	
	
	
}







