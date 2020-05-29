package com.yedam.project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		//입력된 값이 중복된게 아니도록 체크하기.
		int value1 = 0;
		int value3 = 0;
		int value2 = 0;
		int num = 0;
		int[] arr = new int[3];
		int[] arr2 = new int[3];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {

			arr[i] = random.nextInt(9) + 1;

			//중복된 값 체크하기
		}
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 1; i < arr.length; i++) {

				if (arr[j] == arr[i]) {
					arr[i] = random.nextInt(9) + 1;
				
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "배열값: " + arr[i]);
		}
		CompareInter service = new CompareImpl();

		while (num<10) {
			List<ValueBoard> list = new ArrayList<>();
			System.out.println("야구게임 시작");

			System.out.println("첫번째 숫자 입력");
			value1 = scn.nextInt();
			ValueBoard valueboard1 = new ValueBoard(value1);
			service.insert(list, valueboard1);
			System.out.println("두번째 숫자 입력");
			value2 = scn.nextInt();
			ValueBoard valueboard2 = new ValueBoard(value2);
			service.insert(list, valueboard2);
			System.out.println("세번재 숫자 입력");
			value3 = scn.nextInt();
			ValueBoard valueboard3 = new ValueBoard(value3);
			service.insert(list, valueboard3);

			arr2 = service.compare(list, arr);
			for(int i=0; i<arr2.length; i++) {
				if(arr2[i]==2)
					System.out.print("스트라이크, ");
				else if(arr2[i]==1)
					System.out.println("볼, ");
				else
					System.out.println("아웃.");
			}
			System.out.println(" ");
			if(arr2[0]==2 && arr2[1]==2 && arr2[2]==2) {
				num=10;
				System.out.println("3스트라이크, 게임 끝.");
			}
			num++;
			
			
		}

	} //end of main
}

//end of class
