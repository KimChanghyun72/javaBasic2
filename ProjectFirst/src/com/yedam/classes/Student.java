package com.yedam.classes;

public class Student {
	//(속성) -> 필드
	String name;//이름
	int age;//나이
	double height;//키
	double weight;//몸무게
	String major;
	
	//생성자-->instance가 만들어질 때 미리 어떠한 처리를 해두겠다는 뜻(?)
	//필드의 초기값 지정
	//매개값이 없는 생성자를 Default생성자라고 함.
	//생성자가 따로 정의되지 않을 때에는 디폴트생성자가 호출되지만 생성자를 정의하면 디폴트생성자도 따로 정의해줘야 한다.
	public Student(){
		System.out.println("생성자 호출.");
	}
	
	public Student(String name){
		this.name = name;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String major) {
		//this(name, age);
		this(name);
		this.age = age;
		this.major = major;
	}
	
	//(기능) -> 메소드
	void study() {
	};//공부한다
	void exercise() {
		
	};//운동한다
	void eat(String str) {
		System.out.println(str + " 을 먹는다.");
	}//밥을 먹는다
	
	void setMajor(String major) {
		this.major = major;
	}
}//end of class
