package com.yedam.list;

public interface EmpService {
	//define function, no realize
	//인터페이스는 추상메소드를 만들기 위한 기능이기 때문에 abstract 안적어도 구현해줌.
	//한건생성
	public void createEmp(Employee emp);//public abstract void createEmp();
	
	//전체조회	
	public void getEmpList();
	
	//한건수정
	public void changeEmp(Employee emp);
	
	//한건삭제
	public void removeEmp(int empId);
}
