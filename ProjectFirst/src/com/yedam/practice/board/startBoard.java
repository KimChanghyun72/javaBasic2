package com.yedam.practice.board;

import java.util.Scanner;

public class startBoard {

	public void openBoard() {
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("글 제목\t|\t글 내용\t|\t작성자  ");
			BoardArray arr = new BoardArray();
			for (int num = 0; num < BoardArray.title.size(); num++) {
				System.out.print(arr.getTitle(num));
				System.out.print("\t\t");
				System.out.print(arr.getContent(num));
				System.out.print("\t\t");
				System.out.println(arr.getUser(num));
			}

			System.out.println("원하시는 기능을 선택하세요.");
			System.out.println("1.입력  2. 수정  3. 삭제  4. 리스트 보기  5. 게시판 종료");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				String title;
				System.out.println("게시글 제목을 입력하시오.");
				title = scn.nextLine();
				arr.setTitle(title);
				String contents;
				System.out.println("게시글 내용을 입력하시오");
				contents = scn.nextLine();
				arr.setContent(contents);
				String user;
				System.out.println("작성자 이름을 입력하시오.");
				user = scn.nextLine();
				arr.setUser(user);

			} else if (menu == 2) {
				String title;
				System.out.println("수정할 게시글의 제목을 입력하세요.");
				title = scn.nextLine();
				for (int i = 0; i < arr.title.size(); i++) {
					if (arr.getTitle(i).toString().equals(title)) {
						System.out.println("게시글 제목을 입력하시오.");
						title = scn.nextLine();
						arr.setTitle(title, i+1);
						arr.delTitle(i);
						String contents;
						System.out.println("게시글 내용을 입력하시오");
						contents = scn.nextLine();
						arr.setContent(contents, i+1);
						arr.delContent(i);
						String user;
						System.out.println("작성자 이름을 입력하시오.");
						user = scn.nextLine();
						arr.setUser(user, i+1);
						arr.delUser(i);
						break;
					}

				}
			} else if (menu == 3) {
				String title;	
				System.out.println("삭제할 게시글의 제목을 입력하세요.");
				title = scn.nextLine();
				for (int i = 0; i < arr.title.size(); i++) {
					if (arr.getTitle(i).toString().equals(title)) {
						arr.delTitle(i);
						arr.delContent(i);
						arr.delUser(i);
					}
				}

			} else if (menu == 4) {
				openBoard();
			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("게시판이 종료되었습니다.");
	}
}
