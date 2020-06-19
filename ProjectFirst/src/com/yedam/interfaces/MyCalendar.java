package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		cal.set(2020,3,1);
//		System.out.println("년도:" + cal.get(Calendar.YEAR));
//		System.out.println("월:" + cal.get(Calendar.MONTH));
//		System.out.println("일:" + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일:" + cal.get(Calendar.DAY_OF_WEEK));
		showCal(2020, 6);
	}

	public static void showCal(int year, int month) {
		//year, month 달력 출력.
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);

		System.out.println("    [" + year + "년 " + month + "월 " + "달력]");
		String[] week = { " Sun ", "Mon ", "Tue ", "Wed ", "Thr ", "Fri ", "Sat " };
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println();
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%4s", "");
		}

		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%4d", today); //3->공란 3개, d-> decimal, 십진수
			if ((today + dayOfWeek) % 7 == 1)
				System.out.println();
			today++;
		}
		System.out.println();
		System.out.println("프로그램 종료.");
	}//end of showCal

	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		Calendar calen = Calendar.getInstance();
		calen.set(year,month-1, 1);
		dayOfWeek = calen.get(Calendar.DAY_OF_WEEK);
		
		return dayOfWeek;
	}
	
//	public static int getDayOfWeek(int month) {
//		int dayOfWeek = 0;
//		if (month == 5) {
//			dayOfWeek = 6;//일(1), 월(2), 화(3), ...금(6), 토(7)
//		} else if (month == 6) {
//			dayOfWeek = 2;//월요일
//		}
//		return dayOfWeek;
//	}

	public static int getLastDay(int year, int month) {
		int lastDay = 0;
		if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31;
		} else if (month >= 8 && month % 2 == 1) {
			lastDay = 30;
		} else if ((month == 2 && year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0)) {
			lastDay = 29;
		} else if (month == 2) {
			lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}//end of getLastDay

//	public int getAllDay(int year, int month) {
//		int allDay = 0;
//		for (int j = 0; j <= year - 1; j++) {
//			for (int i = 1; i <= 12; i++) {
//				allDay += getLastDay(i, year);
//			}
//		}
//		for(int i= 1; i<= (month-1); i++) {
//			allDay += getLastDay(i, year);
//		}
//		return allDay;
//	}//end of getAllDay
	//윤년 규칙 : 년도가 4로 나누어지면서 100으로는 안 나누어지는 해, 400으로 나누어지는 해.
}//end of class
