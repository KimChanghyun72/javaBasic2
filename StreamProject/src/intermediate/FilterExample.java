package intermediate;

import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		
		
//		employees.stream().filter(new Predicate<Employee>() {
//
//			@Override
//			public boolean test(Employee t) {
//				return t.getIncome() > 3000;
//			}
//			
//		})
//		.forEach(s -> System.out.println(s.toString())); //
		employees.stream() //
		.filter((t) -> t.getIncome() > 3000) //
		.filter((Employee t) -> t.isMale()) //난 getGender로 만들어서 equal쓰려고 했는데 isfemale 만들어놓으니까 더 편한듯. //왜 isMale filter 적용이 안되지.
		.peek(System.out::println) //
		.forEach(s -> s.setIncome(s.getIncome()*1.1)); //
		System.out.println("성과금 지급 후");
		employees.stream().forEach(System.out::println);
	}//end of main
}//end of class
