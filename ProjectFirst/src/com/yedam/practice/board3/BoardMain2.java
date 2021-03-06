package com.yedam.practice.board3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		BoardServiceEx2 service = new BoardServiceImpl2();
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.추가 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();scn.nextLine();
			if(menu==1) {
				System.out.println("제목입력: ");
				String title = scn.nextLine();
				System.out.println("내용입력: ");
				String content = scn.nextLine();
				System.out.println("작성자입력: ");
				String writer = scn.nextLine();
				Board board = new Board(title, content, writer);
				service.insertBoard(board);
			}else if(menu==2) {
				System.out.println("제목입력: ");
				String title = scn.nextLine();
				System.out.println("내용입력: ");
				String content = scn.nextLine();
				System.out.println("작성자입력: ");
				String writer = scn.nextLine();
				Board board = new Board(title, content, null);
				service.updateBoard(board);
			}else if(menu==3) {
				System.out.println("제목입력: ");
				String title = scn.nextLine();
				service.deleteBoard(title);
			}else if(menu==4) {
				service.showBoard();
			}else if(menu==5) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
}
