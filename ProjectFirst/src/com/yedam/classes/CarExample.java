package com.yedam.classes;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		myCar.speed = 60;
		System.out.println(myCar.speed);
		
		Car car2 = new Car("�ڰ���");
		Car car3 = new Car("�ڰ���", "����");
		Car car4 = new Car("�ý�", "����", 200);
		
	}
}
