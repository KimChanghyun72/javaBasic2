package com.yedam.exam;

import java.util.Scanner;

public class MainBoard {
	public static void main(String[] args) {

		BoardService service = new BoardServiceImpl();
		Scanner scn = new Scanner(System.in);
		int num = 0;
		while(true) {
		
			System.out.println("-----------------현재 게시판 목록------------------");
			System.out.println("번호 | \t  제  목  \t |  \t   내  용     \t ");
			service.showBoard();
			
			System.out.println("---------사용할 기능을 선택하십시오.---------");
			System.out.println("-----------1.추가 2.수정 3.삭제-----------");
			System.out.println("선택>");
			int menu = scn.nextInt();scn.nextLine();
			
			if(menu==1) {
				num++;
				System.out.println("제목을 입력하십시오.");
				String title = scn.nextLine();
				System.out.println("내용을 입력하십시오.");
				String contents = scn.nextLine();
				Board board = new Board(num,title, contents);
				service.insertBoard(board);
				
			}else if(menu==2) {
				System.out.println("수정할 게시글의 번호를 입력하십시오.");
				int compareInt = scn.nextInt();scn.nextLine();
				System.out.println("변경할 제목을 입력하십시오.");
				String title = scn.nextLine();
				System.out.println("변경할 내용을 입력하십시오.");
				String contents = scn.nextLine();
				Board board = new Board(compareInt, title, contents);
				service.updateBoard(board);
				
			}else if(menu==3) {
				System.out.println("삭제할 게시글의 번호를 입력하시오.");
				int compareInt = scn.nextInt();scn.nextLine();
				service.deleteBoard(compareInt);
			}
		}
		
	}
}
