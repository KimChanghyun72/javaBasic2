package com.yedam.dev;

public class ArrayExample {
	public static void main(String[] args) {

		int[] intAry = new int[5];
		int[] intAry2 = { 1, 2, 3, 4, 5 };
		int[] intAry3 = new int[10];
		/*intAry[0] = 10;
		intAry[1] = 15;
		intAry[2] = 20;
		intAry[3] = 25;
		intAry[4] = 30;
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		for (int i = 0; i > 5; i++) {
			System.out.println(intAry[i]);
		}
		// sum변수에 intAry에 들어있는 각각을 합해줌
		int sum = intAry[0] + intAry[1] + intAry[2] + intAry[3] + intAry[4];
		
		sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
			sum += intAry[i];
		}
		*/
		// 문제.
		// 5,10,15,....50
		/*for (int i = 0; i < 10; i++) {
			intAry3[i] = 5 * (i + 1);
			System.out.println(intAry3[i]);
		}
		*/
		System.out.println(intAry3.length);
		for(int i = 0; i < intAry3.length; i++) {
			intAry3[i] = 5 * (i+1);
		}
		for(int i=0; i<intAry3.length; i++) {
			System.out.println(intAry3[i]);
		}

	}
}
