package com.yedam.exam;

public interface BoardService {
	
	void insertBoard(Board board);
	void updateBoard(Board board);
	void deleteBoard(int num);
	void showBoard();
}
