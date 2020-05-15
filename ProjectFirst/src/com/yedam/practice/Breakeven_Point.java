package com.yedam.practice;

import java.util.Scanner;

public class Breakeven_Point {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("고정비용, 가변비용, 상품가격을 입력하세요");
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();

		for (int i = 1; i < 210; i++) {

			if (C * i == A + B * i) {
				System.out.println(i+1);
			}
			if (i == 210 && C * i < A + B * i) {
				System.out.println("-1");
			}

		} //end of for
	}//end of main
}//end of class