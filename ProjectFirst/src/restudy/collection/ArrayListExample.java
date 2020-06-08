package restudy.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlect/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String listStr = list.get(i);
			System.out.println(listStr);
		}
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			String listStr = list.get(i);
			System.out.println(listStr);
		}
		
	}
}
