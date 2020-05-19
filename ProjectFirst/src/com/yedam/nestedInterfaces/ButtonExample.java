package com.yedam.nestedInterfaces;

class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("전화를 겁니다.");
	}
	
}

class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
}
public class ButtonExample {
	public static void main(String[] args) {
		//버튼 클래스 안에 인터페이스 정의. 버튼 타입 객체 하나 만들고 버튼 안의 인터페이스에 맞춰서 메시지 전화 클래스 생성.
		//생성한 걸 버튼 클래스 내의 필드에 넣고 그 필드값을 메인 메소드에서 불러와서 출력.
		
		Button btn = new Button();
		CallListener cListener = new CallListener();
		btn.setOnClickListener(cListener);
		//== btn.setOnClickListener(new CallListener());
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClickListener(mListener);
		btn.touch();
		
		
	}
}
