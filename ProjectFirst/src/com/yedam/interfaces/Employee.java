package com.yedam.interfaces;

public class Employee {
	private int employeeId;
	private String lastName;
	private int salary;
	private String hireDate;
	
	//Constructor
	public Employee(int employeeId, String lastName, int salary, String hireDate) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	//get/set method
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", hireDate="
				+ hireDate + "]";
	}

		
}