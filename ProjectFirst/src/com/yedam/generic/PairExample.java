package com.yedam.generic;

public class PairExample {
	public static void main(String[] args) {
		//앞에서 제네릭을 선언했으면 뒤에서는 생략해도 돼.
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(2, "사과");
		if (Utils.compare(p1, p2)) {
			System.out.println("논리적으로 동등한 객체");
		} else {
			System.out.println("논리적으로 다른 객체");
		}
		
		int result = Utils.compare(30, 20);
		System.out.println(result);
			
	
	}
}
