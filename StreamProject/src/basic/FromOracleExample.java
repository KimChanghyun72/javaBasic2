package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FromOracleExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = getConnect();
		try {
			ResultSet rs = conn.prepareStatement("select first_name, last_name, salary from employees")
					.executeQuery();
			while(rs.next()) {
				employees.add(new Employee(rs.getString("first_name"), rs.getString("last_name"),
						rs.getInt("salary")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employees.stream().filter(e -> e.getSalary() > 20000).forEach((Employee e) -> System.out.println(e.getFirstName()
				+ " - "+ e.getLastName() + " - " + e.getSalary()));
	}//end of main
	
	public static Connection getConnect() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@192.168.0.25:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //이 줄 의미.
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return conn;
	}
}//end of FromOracleExample



class Employee {
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}
	
}