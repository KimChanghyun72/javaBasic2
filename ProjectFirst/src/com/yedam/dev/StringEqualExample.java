
package com.yedam.dev;

class Student {
	String name;
}

public class StringEqualExample {
	public static void main(String[] args) {

		Student st1 = new Student();
		Student st2 = new Student();

		st1.name = "Hong";
		st2.name = "Park";

		System.out.println(st1);
		System.out.println(st2);

		String str1 = "Hello";// new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		if (str1 == str2) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다.");
		}

	}
}