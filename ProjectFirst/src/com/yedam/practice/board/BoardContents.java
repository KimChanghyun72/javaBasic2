package com.yedam.practice.board;

public class BoardContents {

	void boardContents() {
		BoardArray arr = new BoardArray(); 
		for(int num=0; num<BoardArray.title.size(); num++) {
			arr.getTitle(num);
			System.out.print("    ");
			arr.getContent(num);
			System.out.println("     ");
			arr.getUser(num);
		}
	}

}
