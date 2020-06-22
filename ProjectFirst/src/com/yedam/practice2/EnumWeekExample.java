package com.yedam.practice2;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		//열거 타입 - 한정된 값만을 갖는 타입. 몇 개의 열거 상수 중 하나의 상수를 저장하는 데이터 타입.
		//public enum 키워드로 열거타입을 선언. 관례적으로 열거 타입 요소인 열거 상수는 대문자로 작성됨.
		//compareTo를 쓰는 걸 보면 String하고 똑같은 것 같아. String은 문자열 다 오지만 열거형은 제한된 것들 중 하나만 저장 가능하다는 게 차이점인 듯.
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.WEDNESDAY; break;
		case 4:
			today = Week.THURSDAY; break;
		case 5:
			today = Week.FRIDAY; break;
		case 6:
			today = Week.SATURDAY; break;
		case 7:
			today = Week.SUNDAY; break;
		case 8:
			today = Week.KIMDAY; break; //=>Week 열거 상수 중 하나 가져온 것임을 확인.
		}
	
	}//end of main
	
	public enum Week{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, KIMDAY
	}//end of Week
}//end of EnumWeekExample

