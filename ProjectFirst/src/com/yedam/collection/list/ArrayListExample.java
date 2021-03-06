package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add(new String("World"));
		list.add(2, "Hong");
		list.add(2,"Hong");
		list.add(2, "Hwang");
		
		for(String str : list) {
			System.out.println(str.toString());
		}
		System.out.println(list.get(1));
		
		list.remove(2);
		System.out.println("after remove(2)");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
