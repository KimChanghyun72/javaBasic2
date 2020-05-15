package com.yedam.interfaces;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	System.out.println("TV 를 켭니다.");	
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 를 끕니다.");
	}

}
