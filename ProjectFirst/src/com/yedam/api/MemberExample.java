package com.yedam.api;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("Hong");
		Member m2 = new Member("Hong");
		Member m3 = new Member("Park");
//		if(m3.equals(m2)) {
//			System.out.println("동등합니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}//m1, m2는 주소값. 다른 객체이므로 주소값이 다르다.
//		
		System.out.println(m1.toString());
		
		if(m1 == m2) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
//		if(m1.hashCode()==m2.hashCode()) {
//			System.out.println("동일한 객체입니다.");
//		}else {
//			System.out.println("다른 객체입니다.");
//		}
	}

}
