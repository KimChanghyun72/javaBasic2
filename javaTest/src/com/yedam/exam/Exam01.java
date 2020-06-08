package com.yedam.exam;

public class Exam01 {
	public static void main(String[] args) {
		int sumOf2 = 0;
		int sumOf3 = 0;
		int length = 100;
		for(int i=1; i<=length; i++) {
			if(i%2==0 && i%3!=0) {//2의 배수의 합(3의 배수는 제외)
				sumOf2 +=i;
			}
			if(i%3==0 && i%2!=0) {//3의 배수의 합(2의 배수는 제외)
				sumOf3 +=i;
			}
		}
		System.out.println(sumOf2);
		System.out.println(sumOf3);
		
	}//end of main
}
