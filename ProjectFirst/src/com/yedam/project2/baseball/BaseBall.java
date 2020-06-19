package com.yedam.project2.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random random = new Random();
		int[] oneAry = new int[3];
		int[] twoAry = new int[3];
		int count = 0;
		for (int i = 0; i < oneAry.length; i++) {
			oneAry[i] = random.nextInt(9) + 1;

		}
		for (int j = 0; j < oneAry.length - 1; j++) {
			for (int i = j + 1; i < oneAry.length; i++) {
				while (true) {
					if (oneAry[j] == oneAry[i]) {
						oneAry[i] = random.nextInt(9) + 1;

					} else {
						break;
					}
				}

			}
		}
		for (int i = 0; i < oneAry.length; i++) {
			System.out.println(oneAry[i]);
		}
		while (count < 9) {
			int strike = 0;
			int ball = 0;

			System.out.println("받을 숫자 입력");
			for (int i = 0; i < twoAry.length; i++) {
				twoAry[i] = scn.nextInt();
			}
			for (int i = 0; i < oneAry.length; i++) {
				for (int j = 0; j < twoAry.length; j++) {
					if (i == j && oneAry[i] == twoAry[j]) {
						strike++;
					} else if (oneAry[i] == twoAry[j]) {
						ball++;
					} else {

					}
				}
			} // 스트라이크 2 볼 1 아웃 0 //result=>
			System.out.println(strike + "스트라이크, " + ball + "볼");
			if (strike == 3) { 
				count = 9;
			}
			count++;
			 if (count == 9) {
				System.out.println("기회를 다 쓰셨습니다.");
			} else {
				System.out.println((9 - count) + "번 기회가 남았습니다.");				
			}

		} // end of while
		System.out.println("게임 over");
	}// end of main
}// end of while
