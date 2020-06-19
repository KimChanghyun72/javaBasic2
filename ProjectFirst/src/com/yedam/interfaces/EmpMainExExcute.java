package com.yedam.interfaces;

import java.util.Scanner;

public class EmpMainExExcute {
	public static void main(String[] args) {
		EmpMainExample run = new EmpMainExample();
		Scanner scn = new Scanner(System.in);
		while (true) {
			try {
				run.EmpMainExecute();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				scn.nextLine();
				
			}
		}
	}

}
