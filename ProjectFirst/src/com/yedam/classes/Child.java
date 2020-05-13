package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {
	/*Child(){
		super();
	}*///error
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber);	
	}
	Child(){
		super();
	}
	void showInfo() {
		Child child = new Child();
		//child.getLastName();//default x
		child.getFirstName();//protected
		child.getTelNumber();//public
	}
	
	
}
