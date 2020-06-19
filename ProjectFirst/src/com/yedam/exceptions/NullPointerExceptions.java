package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = null;
		
		try {//alt+shift+z ->try&catch 구문
		System.out.println(str.toString());//runtime exception error->예외처리 안해도 실행에는 문제가 없음.
		Class.forName("java.lang.String2");//Exception
		} //catch(NullPointerException e) {
		//System.out.println("실행중 오류가 발생");}
		catch(Exception e) {//Exception은 최상위권한. 여러범주의 오류를 다 이걸로 퉁침.
			System.out.println("알수없는 예외입니다.");
		}
		
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("알 수 없는 예외입니다.");
			
		}//Exception
		
		System.out.println("프로그램 종료");
		

	}

}