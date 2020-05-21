package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	public static void main(String[] args) {
		Object[] strAry = new Object[5];
		//String[] strAry = new String[5];
//		strAry[0] = "Hello";
//		strAry[1] = new Integer(0);
//		
//		String str = (String) strAry[0];
//		Integer num = (Integer) strAry[1];
//		Integer num1 = (Integer) strAry[0];
//	//	빈번한 타입 변환이 발생하면 프로그램의 성능이 떨어짐
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(new Double(2.4));
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		Double d1 = (Double)list.get(0);
		//이 경우 컴파일하기 전에는 오류가 있는지 알 수 없음. 이걸 컴파일 전에 알기 위해 사용하는 게 제네릭
		
		//제네릭. <>안의 타입만 받을 수 있게 해 줌.
		List<String> strList = new ArrayList<String>();
		strList.add(new String("Hello"));
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
	}
}
