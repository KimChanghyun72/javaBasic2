package com.yedam.project2;

import java.util.ArrayList;
import java.util.List;

public class Oiler49 {
	public static void main(String[] args) {
		String aaa = "1234";
		String bbb = Character.toString(aaa.charAt(3));
		Integer.parseInt(bbb);
		System.out.println(bbb);
		List<Integer> list = new ArrayList<>();
		
		
		for(int num=1000; num<10000; num++) {
			for(int div=2; div<num/2; div++) {				
				if(num%div==0) {
					break;
				}
				if(div == (num/2-1)) {
					list.add(num);
				}
			}
			
		}
//		for(int num : list) {
//			System.out.println(num);
//		}
////		
//		for(int num : list) {
//			for(int num2 : list) {
//				if(num+3330==num2 && num-3330==num2) {
//					System.out.println(num);
//					
//				}
//				
//			}
//		}
//		
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				if((list.get(i)+3330 == list.get(j)) && (list.get(i)+6660 == list.get(j))) {
					System.out.println(list.get(i));
				}
			}
		}
		
	}//end of main
}//end of class
