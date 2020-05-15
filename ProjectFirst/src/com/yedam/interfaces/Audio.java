package com.yedam.interfaces;

public class Audio implements RemoteControl {
//RemoteControl 인터페이스를 구현해야하는 Audio 클래스.

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio 를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio 를 끕니다.");
	}
	

}
