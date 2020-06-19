package com.yedam.classes;

public class People {
	//속성(필드) 3가지
	int age;
	double height;
	String degree;
	
	//생성자
	People(){
		
	}
	People(String str){
		degree=str;
	}
	
	//기능(메소드 ) 2가지
	void Sleep() {
		System.out.println("이 사람의 수면시간은 7시간 입니다.");
	}
	
	void Like(String str) {
		System.out.println("이 사람은 "+str+" 을(를) 좋아합니다.");
	}
	
	void showInfo() {
		System.out.println("age: "+age+" height: "+height+" degree: "+degree);
	}
}
