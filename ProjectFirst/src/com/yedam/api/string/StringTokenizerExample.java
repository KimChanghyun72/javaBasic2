package com.yedam.api.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//how1:
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2:
		st = new StringTokenizer(text, "/");
		while( st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
