package com.yedam.classes.abstract_class;
//추상클래스()
public abstract class Animal {
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	//추상메소드->안의 내용을 가질 수 없음. 정의만 하는거임.
	public abstract void sound(); 
}
