package com.yedam.api.arrays;

import java.util.Arrays;

public class Member implements Comparable<Member>{
	String name;
	int age;
	
	Member(String name){
		this.name = name;
	}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


//public class MemberSortExample{
//	public static void main(String[] args) {
//		Member m1 = new Member("aaaa", 25);
//		Member m2 = new Member("bbbb", 20);
//		Member m3 = new Member("cccc", 15);
//		Member[] ary = {m1, m2, m3 };
//		Arrays.parallelSort(ary);
//		for(Member m: ary) {
//			System.out.println(m.getName());
//			
//		}
//		String s = "aaa";
//		System.out.println(s.compareTo("abb"));
//		
//		Integer[] iAry = {1,2,3};
//		Arrays.sort(iAry);
//		for(Integer m : iAry) {
//			
//		}
//		
//	}
//}