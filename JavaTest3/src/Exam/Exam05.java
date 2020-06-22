package Exam;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Exam05 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Connection conn = Exam04.getConnect();
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
		
//		int sum = employees.stream().filter(s -> s.getSalary() < 5000).sorted(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//			
//		})
//		.peek(s -> System.out.println("급여: " + s.getSalary() + "이름: " + s.getFirstName()))
//		.map(e -> e.getSalary()).reduce(0, new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				System.out.println("t: " + t + " u: " + u);
//				return t + u;
//			}
//			
//		});
//		
//		System.out.println("급여 합계: " + sum);
//		System.out.println();
		
		int sum2 = employees.stream().filter(s -> s.getSalary() < 5000)
									.sorted((o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary()))
									.peek(s -> System.out.println("급여: " + s.getSalary() + " 이름: " + s.getFirstName()))
									.map(e -> e.getSalary()).reduce(0, (t,u) -> (t + u));
		System.out.println("급여 합계: " + sum2);
//		System.out.println("급여 합계: " + employees.stream().filter(s -> s.getSalary() < 5000)
//				.sorted((o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary()))
//				.peek(s -> System.out.println("급여: " + s.getSalary() + " 이름: " + s.getFirstName()))
//				.map(e -> e.getSalary()).reduce(0, (t,u) -> (t + u)));
		
	}//end of main
}//end of Exam05
