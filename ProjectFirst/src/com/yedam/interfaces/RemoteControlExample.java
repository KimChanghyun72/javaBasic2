package com.yedam.interfaces;

public class RemoteControlExample {
public static void main(String[] args) {
	RemoteControl rc = new Audio();
	rc.turnOn();
	rc.turnOff();
	
	rc = new Television();
	rc.turnOn();
	rc.turnOff();
	
	//익명객체. 한 번만 정의해서 사용할 때 선언함.
	RemoteControl rc2 = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("익명 객체 켭니다.");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("익명 객체 끕니다.");
		}
		
	};//보통 객체선언하고 다르게 ;로 끝내줘야되네?
	rc2.turnOn();
	rc2.turnOff();
	

}
}
