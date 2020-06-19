package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		
		vehicle = new Bus();//부모클래스 변수 = 자식 클래스 인스턴스 할당 가능.
		vehicle.run();
		
		vehicle = new Taxi();
		vehicle.run();
		
		//부모 클래스가 자식 클래스에 할당 될 때는 자식 타입으로 강제형변환 필요함.
		Taxi taxi = (Taxi)vehicle;//자식 클래스 = (강제형변환) 부모클래스;
		taxi.run();
		
	}
}
