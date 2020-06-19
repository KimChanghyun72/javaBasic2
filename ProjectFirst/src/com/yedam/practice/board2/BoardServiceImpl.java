package com.yedam.practice.board2;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	@Override
	public void insertBoard(List<Board2> list, Board2 board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board2> list, Board2 board) {
		for (int i = 0; i < list.size(); i++) {
			if (board.getTitle().equals(list.get(i).getTitle())) {
				list.get(i).setTitle(board.getTitle());
				list.get(i).setContents(board.getContents());
			}
		}

	}

	@Override
	public void deleteBoard(List<Board2> list, Board2 board) {
		for (int i = 0; i < list.size(); i++) {
			if (board.getTitle().equals(list.get(i).getTitle())) {
				list.remove(i);
			}

		}

	}
}
