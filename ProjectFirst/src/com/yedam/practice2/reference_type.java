package com.yedam.practice2;

public class reference_type {
	public static void main(String[] args) {
		//참조타입 - 객체의 번지를 참조하는 타입. 배열, 열거, 클래스, 인터페이스 타입. <->기본 타입.
		//참조타입을 이용해 선언된 변수는 메모리의 번지를 값으로 가짐. //참조타입의 !=, ==연산은 같은 객체(주소)를 참조하는지 알아볼 때 사용됨.
		//NullPointerException - null값을 가진 참조타입 변수를 사용할 때 발생. JavaFX를 사용할 때 자주 일어났던 실수.
		//리터럴? - 변수에 넣는 변하지 않는 데이터. 일반적인 인스턴스는 선언되고 변경되는 일이 있지만 리터럴은 변할 상황에서 새로운 객체를 만들어준다.
		//
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<scores.length;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
		//값 목록으로 배열을 생성함과 동시에 메소드의 매개값으로 사용할 때에는 반드시 new 연산자 사용.
	}//end of main
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum+= scores[i];
		}
		return sum;
	}//end of add()
}//end of reference_type
