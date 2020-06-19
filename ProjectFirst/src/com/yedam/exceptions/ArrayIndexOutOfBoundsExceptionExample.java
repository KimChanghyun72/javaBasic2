package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[3];
		
		for(int i=0; i<=intAry.length; i++) {
			try {
				
			intAry[i] = i + 1;
			System.out.println(intAry[i]);
			int num1 = Integer.parseInt(args[0]);
			}catch(Exception e2) {//->실행오류의 종류를 모를 때에는 최상위 예외 객체인 Exception 을 선언하고 '알수없는예외입니다.' 출력하도록 처리.
				System.out.println("알 수 없는 오류 발생.");
			//맨 위에서 최상위 예외처리가 되었기 때문에 밑의 오류들은 쓸 용도가 없어서 오류 발생.
//			} catch(ArrayIndexOutOfBoundsException e) {//적절한 약어 + crtl+spacebar
//				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");
//			} catch(NumberFormatException e1) {
//				System.out.println("변환 불가");
			}
		}
		System.out.println("end of prog.");
	}
}
