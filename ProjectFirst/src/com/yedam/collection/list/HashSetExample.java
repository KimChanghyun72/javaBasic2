package com.yedam.collection.list;

import java.util.HashSet;
import java.util.Set;
class Member{
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
	@Override
	public int hashCode() {
		//return this.name.hashCode();
		return this.name.hashCode();
		//hashcode ->객체마다 가지는 독특한 값
	}
	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		members.add(new Member("Hong", 10));
		members.add(new Member("Hong", 20));
		members.add(new Member("Hong", 10));
		//중복되지 않고 그대로 나옴. 객체를 새로 생성해서 대입해서 그런건가?
		//set.add는 new Member가 가지고 있는 hashcode 와 equals에 따라서 해석이 달라진다(?)
		
		for(Member member : members) {
			System.out.println(member.toString());
		}
		System.out.println("");
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		for(String str : set) {
			System.out.println(str.toString());
		}//중복된 값을 하나로 처리함.
		
//		for(int i=0; i<set.size(); i++) {
//			System.out.println(set.);
//		}
	}
}
