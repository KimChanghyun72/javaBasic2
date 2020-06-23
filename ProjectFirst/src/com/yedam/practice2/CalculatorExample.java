package com.yedam.practice2;

public class CalculatorExample {
	public static void main(String[] args) {
		//정적 변수는 클래스에 고정된 멤버 -> 해당 클래스 타입의 변수를 선언하지 않고도  클래스.필드or메소드 의 형태로 사용 가능함.
		
		
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
	}//end of main
	
}//end of CalculatorExample

class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
