package com.yedam.practice.board3;

import java.util.List;

public interface BoardService2 {
	void insertBoard(List<Board> list, Board board);
	void updateBoard(List<Board> list, Board board);
	void deleteBoard(List<Board> list, String title);//삭제
	void showBoard(List<Board> list);//리스트
}
