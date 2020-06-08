package com.yedam.exam;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int startVal = 0;
		int endVal = 0;
		System.out.println("시작값을 입력하세요.");
		startVal = scn.nextInt();
		System.out.println("끝값을 입력하세요.");
		endVal = scn.nextInt();

		while (startVal > endVal) {
			System.out.println("끝값은 시작값보다 커야합니다. 다시 입력하세요");
			endVal = scn.nextInt();
		}
		int forSum = Exam03.forSum(startVal, endVal);
		System.out.println("forSum: " + forSum);
		int whileSum = Exam03.whileSum(startVal, endVal);
		System.out.println("whileSum: " + whileSum);
	}//end of main

	static int forSum(int startVal, int endVal) {
		int sum=0;
		for(int i=startVal;i<=endVal; i++) {
			sum +=i;
		}
		return sum;
	}//end of forSum
	static int whileSum(int startVal, int endVal) {
		int sum=0;
		while(endVal>=startVal) {
			sum +=startVal;
			startVal++;
		}
		
		return sum;
	}
}
