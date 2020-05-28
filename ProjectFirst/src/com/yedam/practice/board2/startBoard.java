package com.yedam.practice.board2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.practice.board.Board;
import com.yedam.practice.board.BoardArray;

public class startBoard {
	List<Board2> list = new ArrayList<>();
	BoardService service = new BoardServiceImpl();
	public void startBoard() {
		while(true) {
			Scanner scn = new Scanner(System.in);
			Board2 board1 = new Board2();
			
			//메소드로 따로 떼낼 것.
			
			System.out.println("원하는 기능을 선택하세요.");
			System.out.println("1. 입력   2. 수정  3. 삭제   4. 리스트");
			System.out.println("입력>");
			int menu = scn.nextInt();scn.nextLine();
			
			if(menu == 1) {
			
			
			System.out.println("제목을 입력하세요");
			String title = scn.nextLine();
			board1.setTitle(title);
			System.out.println("내용을 입력하세요");
			String contents = scn.nextLine();
			board1.setContents(contents);
			System.out.println("유저를 입력하세요");
			String user = scn.nextLine();
			board1.setUser(user);
			service.insertBoard(list, board1);
			
			}else if(menu ==2) {
				System.out.println("수정을 원하는 게시글의 제목을 넣으세요.");
				String title = scn.nextLine();
				for(int i=0; i<list.size();i++) {
					if(list.get(i).getTitle().equals(title)) {
						System.out.println("새로 넣을 제목을 입력하시길.");
						title = scn.nextLine();
						board1.setTitle(title);
						System.out.println("새로 넣을 내용을 입력하시길.");
						String contents = scn.nextLine();
						board1.setContents(contents);
						System.out.println("새로 넣을 사용자를 입력하시길.");
						String user = scn.nextLine();
						board1.setUser(user);
						service.updateBoard(list, board1);
					}
				}
				System.out.println("맞는 제목이 음슴");
			}else if(menu == 3){
				System.out.println("삭제하고싶은 글의 제목 입력");
				String title = scn.nextLine();
				board1.setTitle(title);
				service.deleteBoard(list, board1);
			}else if(menu == 4) {
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(0)!=null) {
					System.out.print(list.get(i).getTitle());
					System.out.print("\t");
					System.out.print(list.get(i).getContents());
					System.out.print("\t");
					System.out.print(list.get(i).getUser());
					System.out.println("");
					}
				}
				
			}
			
			
		}
	}
}
