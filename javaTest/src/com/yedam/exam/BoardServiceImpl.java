package com.yedam.exam;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl implements BoardService {

	List<Board> list = new ArrayList<>();

	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(Board board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() == board.getNum()) {
				list.get(i).setTitle(board.getTitle());
				list.get(i).setContents(board.getContents());
			}
		}

	}

	@Override
	public void deleteBoard(int num) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() == num) {
				list.remove(i);
			}
		}

	}

//	@Override
//	public void showBoard() {
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(
//					list.get(i).getNum() + "." + "\t" + list.get(i).getTitle() + "\t" + list.get(i).getContents());
//		}
//
//	}

	public void showBoard() {
		for (int i = 0; i < list.size(); i++) {
			if((list.get(i).getTitle().length()>10) && (list.get(i).getContents().length()>20)) {
			System.out.println(
					list.get(i).getNum() + "." + "  " + list.get(i).getTitle().substring(0,6) + "..." + "\t" + list.get(i).getContents().substring(0,16)+"...");
			}else {
				System.out.println(
						list.get(i).getNum() + "." + "  " + list.get(i).getTitle() + "\t" + list.get(i).getContents());
			}
			}

	}
}