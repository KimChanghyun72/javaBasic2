package com.yedam.practice;


public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControl smartphone = new RemoteControl() {
			int volume =0;
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("티비켜");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("티비꺼");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				System.out.println("볼륨셋팅");
				this.volume = volume+5;
			}
			
		};
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
