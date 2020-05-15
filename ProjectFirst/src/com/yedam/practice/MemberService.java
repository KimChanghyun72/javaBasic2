package com.yedam.practice;

public class MemberService {
	
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password) {
		if(id.contentEquals(this.id)&&password.contentEquals(this.password))
			return true;
		else
			return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
