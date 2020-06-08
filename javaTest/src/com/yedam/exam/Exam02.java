package com.yedam.exam;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("-----------학생수를 입력하세요.-------------");
		int num = scn.nextInt();
		int[] gradeAry = new int[num];
		while (true) {
			System.out.println("-----------------기능선택---------------");
			System.out.println("1.점수입력 2. 점수 리스트 3.최고점 및 평균점수 산출   4.학생수 조회");
			System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("학생의 점수를 입력하세요.");
				int grade = scn.nextInt();
				for (int i = 0; i < gradeAry.length; i++) {
					if (gradeAry[i] == 0) {
						gradeAry[i] = grade;
						break;
					}
				}
			}else if(menu==2) {
				for(int i=0; i<gradeAry.length; i++) {
					if(gradeAry[i]!=0) {
						System.out.println(gradeAry[i]);
					}
				}
			}else if(menu==3) {
				int sum = 0;
				int maxValue=0;
				for(int i=0; i<gradeAry.length; i++) {
					if(gradeAry[i]!=0) {
						sum += gradeAry[i];
					}
					if(gradeAry[i]!=0 && gradeAry[i]>=maxValue) {
						maxValue=gradeAry[i];
					}
				}
				double avg = (double)sum/gradeAry.length;
				System.out.println("평균값: "+avg);
				System.out.println("최대값: "+maxValue);
			}else if(menu==4) {
				System.out.println("현재 학생수: " + num);
			}
		}
	}
}
