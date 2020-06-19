package com.yedam.interfaces;

public class EmpServiceImpl implements EmpService {
	EmpDAO  dao = new EmpDAO();
	
	@Override
	public void createEmp(Employee emp) {
		// TODO Auto-generated method stub
		dao.insertEmp(emp);
	}

	@Override
	public void getEmpList() {
		for(Employee emp : dao.getEmpList()) {
			if(emp !=null) {
			System.out.println(emp.toString());
			}
		}
		
	}

	@Override
	public void changeEmp(Employee emp) {
		// TODO Auto-generated method stub
		dao.updateEmp(emp);
		
	}

	@Override
	public void removeEmp(int empId) {
		// TODO Auto-generated method stub
		dao.deleteEmp(empId);
	}
	
	
}
