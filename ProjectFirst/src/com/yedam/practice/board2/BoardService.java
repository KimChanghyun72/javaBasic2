package com.yedam.practice.board2;

import java.util.List;

public interface BoardService {
	void insertBoard(List<Board2> list, Board2 board);
	void updateBoard(List<Board2> list, Board2 board);
	void deleteBoard(List<Board2> list, Board2 board);
	
}
