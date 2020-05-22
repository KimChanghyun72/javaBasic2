package com.yedam.api.math;

public class MathRandomExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 눈: " + num);

		int[] numAry = new int[6];
		for (int i = 0; i < numAry.length; i++) {
			numAry[i] = (int) (Math.random() * 45) + 1;
		}
		for (int i = 0; i < numAry.length-1; i++) {
			while (true) {
				if (numAry[i] == numAry[i + 1]) {
					numAry[i] = (int) (Math.random() * 45) + 1;
				} else {
					break;
				}
			}
		}//숫자를 하나씩 삽입하는 for문 i, 가장 최근에 삽입된 변수와 처음부터 변수 전까지의 수를 비교하기 위해 도는 for문 j
		//구현 필요..
		
		/*for (int i = 0; i < numAry.length; i++) {
			numAry[i] = (int) (Math.random() * 45) + 1;
			if(i>0) {
				for(int j=0; j<i; j++) {
					while (true) {
						if (numAry[i] == numAry[j]) {
							numAry[i] = (int) (Math.random() * 45) + 1;
						} else {
							break;
						}
					}
				}
			}
		}//진짜 더러운 구문이다.
		*/
		for(int i=0; i<numAry.length; i++) {
			System.out.print(numAry[i] + " ");
		}

	}
}
