package com.yedam.interfaces;

import java.util.Scanner;

public class EmpMainExample {
	static Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImplVer2();
	
	void EmpMainExecute() {
		while (true) {
			System.out.println("======================================");
			System.out.println("1.입력 2.전체리스트 3.수정  4.삭제  5.종료");
			System.out.println("======================================");
			System.out.println("선택> ");

			int menu = 0;
			menu = scn.nextInt();scn.nextLine();
			
			

			if (menu == 1) {
				executeNum1();

			} else if (menu == 2) {
				executeNum2();

			} else if (menu == 3) {
				executeNum3();
			} else if (menu == 4) {
				executeNum4();
			} else if (menu == 5) {
				break;
			}
		} // end of while loop
		System.out.println("프로그램 종료.");

	}
	void executeNum1() {
		int empId;
		
		System.out.println("사원번호 입력: ");
		empId = scn.nextInt();
		scn.nextLine();
	
	System.out.println("성 입력: ");
	String lastName = scn.nextLine();
	System.out.println("급여 입력: ");
	int salary = scn.nextInt();
	scn.nextLine();
	System.out.println("입사일 입력(2020/05/05): ");
	String hireDate = scn.nextLine();
	// 등록할 값 입력
	Employee emp = new Employee(empId, lastName, salary, hireDate);// 뒤에 것 부터 생성하는 방식 좋은데?
	service.createEmp(emp);
	}
	void executeNum2() {
		service.getEmpList();
	}
	void executeNum3() {
		System.out.println("변경 사원번호 입력:");
		int empId = scn.nextInt();
		System.out.println("급여 입력: ");
		int salary = scn.nextInt();
		Employee emp = new Employee(empId, "", salary, "");
		service.changeEmp(emp);
	}
	void executeNum4() {
		System.out.println("삭제할 사원번호 입력: ");
		int empId = scn.nextInt();

		service.removeEmp(empId);
	}
	
}
