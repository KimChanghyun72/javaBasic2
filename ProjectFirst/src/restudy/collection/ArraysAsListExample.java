package restudy.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name: list1) {
			System.out.println(name);
		}
		//처음 크기 초과하면 오류 발생.
//		list1.add("강철권");
//		System.out.println(list1.get(4));
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
