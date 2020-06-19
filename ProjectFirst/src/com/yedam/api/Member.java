package com.yedam.api;

public class Member extends Object {
	public String id;
	public Member() {
		//기본 생성자
		
	}
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
		//return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member m = (Member) obj;
		return this.id.equals(m.id);
		
		//return super.equals(obj);
	}
	@Override
	public String toString() {
		
		return "id값은 " + this.id;
		//return super.toString();
	}
	
}