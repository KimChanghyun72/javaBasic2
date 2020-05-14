package com.yedam.classes.abstract_class;

public class Bird extends Animal{

	public Bird(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("콕코두둘두");
	}
	
	
}
