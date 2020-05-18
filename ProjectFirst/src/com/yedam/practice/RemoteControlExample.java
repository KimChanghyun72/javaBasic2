package com.yedam.practice;

import com.yedam.interfaces.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("장비를 실행합니다.");
			}
			public void turnOff() {
				System.out.println("장비를 정지합니다. 어 안되잖아?");
			}
			public void setVolume(int volume) {
				
			}
		};
	}
}
