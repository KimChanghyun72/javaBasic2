package com.yedam.practice;

import com.yedam.interfaces.Audio;
import com.yedam.interfaces.RemoteControl;
import com.yedam.interfaces.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
//		RemoteControl rc = new RemoteControl() {
//			public void turnOn() {
//				System.out.println("장비를 실행합니다.");
//			}
//			public void turnOff() {
//				System.out.println("장비를 정지합니다. 어 안되잖아?");
//			}
//			public void setVolume(int volume) {
//				
//			}
//		};
	}
}
