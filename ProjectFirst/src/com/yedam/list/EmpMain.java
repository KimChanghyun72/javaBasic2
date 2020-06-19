package com.yedam.list;

import java.util.Scanner;

public class EmpMain {
	//static Scanner scn = new Scanner(System.in);
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// 1.입력 2.전체 리스트 3. 수정 4. 삭제 5. 종료
		 EmpService service = new EmpServiceImpl(); //인터페이스를 사용해 개량된 버전을 만든 뒤 생성자만 바꿔주면
		// 쉬운 적용 가능.
		//EmpService service = new EmpServiceImplVer2();

		while (true) {
			System.out.println("======================================");
			System.out.println("1.입력 2.전체리스트 3.수정  4.삭제  5.종료");
			System.out.println("======================================");
			System.out.println("선택> ");

			int menu = 0;

			try {
			menu = scn.nextInt();
			} catch (Exception e) {
				System.out.println("입력 유형이 알맞지 않습니다.");
				scn.nextLine();
				//e.printStackTrace();
				//menu = recursive();
			}

			if (menu == 1) {

				int empId;
				try {
					System.out.println("사원번호 입력: ");
					empId = scn.nextInt();
					scn.nextLine();
				} catch (Exception e) {
					
					//e.printStackTrace();
					System.out.println("입력 유형이 알맞지 않습니다.");scn.nextLine();
					empId = recursive("사원번호");
				}
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

			} else if (menu == 2) {
				service.getEmpList();

			} else if (menu == 3) {
				System.out.println("변경 사원번호 입력:");
				int empId = scn.nextInt();
				System.out.println("급여 입력: ");
				int salary = scn.nextInt();
				Employee emp = new Employee(empId, "", salary, "");
				service.changeEmp(emp);

			} else if (menu == 4) {
				System.out.println("삭제할 사원번호 입력: ");
				int empId = scn.nextInt();

				service.removeEmp(empId);

			} else if (menu == 5) {
				break;
			}
		} // end of while loop
		System.out.println("프로그램 종료.");

	}	// end of main

	/*	static int recursive() {
			int returnValue = 0;
			while (true) {
				try {
					System.out.println("사원 번호를 입력하세요.");
					returnValue = scn.nextInt();
					scn.nextLine();
					break;
				} catch (Exception e) {
					//e.printStackTrace();
					scn.nextLine();
	}
			}
		}*/
	
	
	
		static int recursive() {
			int returnValue = 0;
			while (true) {
				try {
					System.out.println("사원 번호를 입력하세요.");
					returnValue = scn.nextInt();
					scn.nextLine();
					break;
				} catch (Exception e) {
	
					//e.printStackTrace();
					scn.nextLine();
				}

			}
			return returnValue;
		}

	
	
		static int recursive(String str) {
			int returnValue = 0;
			while (true) {
				try {
					System.out.println(str + "를 입력하세요.");
					returnValue = scn.nextInt();
					scn.nextLine();
					break;
				} catch (Exception e) {
					//e.printStackTrace();
					scn.nextLine();
				}
			}
			return returnValue = 0;
		}
	}//end of class
	
		
		
	
