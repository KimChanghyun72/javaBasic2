package com.yedam.classes;

public class CarExample {
	public static void main(String[] args) {
		//new Car(); //힙 영역에 인스턴스 생성. 이상태에서는 접근 불가능
		Car c1 = new Car();//변수를 선언해서 주소를 인스턴스의 주소를 넣어줌
		c1.model = "Sonata";
		System.out.println(c1.maxSpeed);
		
		Car c2 = new Car(200);
		c2.model = "BMW";
		
		Car c3 = new Car("Benz");
		c3.maxSpeed = 300;
		
		new Car("Accent", 200);
	}
}
