package com.yedam.classes.abstract_class;

public class Cat extends Animal{

	public Cat(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("떼껄룩");
	}
	
	//public abstract void eat();//추상메소드는 추상클래스에서만 생성가능.
}