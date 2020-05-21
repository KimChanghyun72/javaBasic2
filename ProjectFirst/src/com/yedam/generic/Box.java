package com.yedam.generic;

//기본 설정은 object 로 정해두고 임의의 제네릭 T(type parameter) 가 정해진 순간 거기에 맞춰서 타입 변환. 
public class Box<T> {
	//Object object;
	T object;
	
	void set(T object) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
	
//	void set(Object object) {
//		this.object = object;
//	}
	
//	Object get() {
//		return object;
//	}
	
}
