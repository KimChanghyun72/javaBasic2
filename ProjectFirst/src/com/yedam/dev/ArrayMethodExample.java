package com.yedam.dev;

public class ArrayMethodExample {
	public static void main(String[] args) {
		
		int result = sum(10, 11);
		int[] intAry = {1,2,3,4,5};
		double[] dobAry = {1.1, 2.2, 3.3, 4.4};
		result = sumAry(intAry);
		double result2 = avgAry(dobAry);
		//System.out.println("배열 intAry 합: " + result);
		System.out.println("배열 dobAry 합: " + result2);
	}
	
	public static int sumAry(int[] ary) {
		//매개값으로 받은 배열의 요소들의 평균 계산.
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum +=ary[i];
		}
		
		return sum;
	}
	
	public static double avgAry(double[] ary) {
		double sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return (sum/ary.length);
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
