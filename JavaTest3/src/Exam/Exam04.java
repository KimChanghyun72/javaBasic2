package Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Exam04 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = getConnect();
		try {
			ResultSet rs = conn.prepareStatement("select * from employees")
					.executeQuery();
			while(rs.next()) {
				employees.add(new Employee(rs.getString("first_name"), rs.getString("last_name"),
						rs.getInt("salary")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		List<Employee> filterList = employees.stream().filter(s -> s.getFirstName().startsWith("S")).sorted(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}
//			
//		}).peek(s -> System.out.println(s.getFirstName() + " ")).collect(Collectors.toList());
//		
//		long cnt = filterList.stream().count();//map(t -> t.getFirstName()).
//		System.out.println(cnt + "명");
		
		long cnt2 = employees.stream().map(t -> t.getFirstName()).filter(s -> s.startsWith("S")).sorted().peek(s -> System.out.println(s + " ")).count();
		System.out.println(cnt2 + "명");
		
	}//end of main
	
	public static Connection getConnect() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //이 줄 의미.
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return conn;
	}//end of getConnect()
	
}//end of Exam04
	
	class Employee implements Comparable<Employee> {
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

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return Integer.compare(salary, o.salary);
		}
		
		
}//end of Employee
