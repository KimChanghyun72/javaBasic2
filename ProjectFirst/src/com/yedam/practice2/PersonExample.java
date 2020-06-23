package com.yedam.practice2;

public class PersonExample {
	public static void main(String[] args) {
		
		//final - 한 번 초기화하면 필드값을 다시는 수정 불가능한 필드.
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
	}//end of main
}//end of class

class Person{
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
