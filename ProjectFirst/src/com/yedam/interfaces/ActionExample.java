package com.yedam.interfaces;
//파일만들때 interface로 만들면 안에 메인클래스, 메소드 만들어도 실행이 안되네. 식겁.
//또 public 선언이 안되더라. 자기 꺼 안에서만 퍼블릭 선언된다고
public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action(){

			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("복사를 합니다.");
			}
			
		};
		action.work();//복사를 합니다.
	}
}

interface Action {
	void work();
}
//