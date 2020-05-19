package com.yedam.nestedInterfaces;

public class Button {
	//필드
	OnClickListener listener;
	//메소드
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	//클래스 내 인터페이스
	interface OnClickListener{
		void onClick();
		
	}
}
