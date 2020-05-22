package com.yedam.api.math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택 번호");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) +1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		//여러 번 컴파일해도 같은 게 나오는 이유는 새로 랜덤 메소드를 실행하는 게 아니라
		//이전에 실행했던 랜덤 메소드 값을 다시 불러오는 게 아닐까? 만약 내용이 틀렸다면 거기에 대한 변경분만 새로 적용한다던가
		for(int i=0; i<6; i++) {
			System.out.print(random.nextInt(45) +1 + " " );
		}
		
		//당첨여부
		Arrays.parallelSort(selectNumber);
		Arrays.parallelSort(winningNumber);
		boolean result = Arrays.equals(selectNumber,  winningNumber);
		System.out.println("당첨 여부"); 
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
			
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}//end of main
}//end of class
