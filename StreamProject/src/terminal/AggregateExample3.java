package terminal;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import intermediate.Employee;

public class AggregateExample3 {
	public static void main(String[] args) {
		//1
		double result = Employee.persons().stream()
		.map(new Function<Employee, Double>(){

			@Override
			public Double apply(Employee t) {
				return t.getIncome();
			}
			
		}).reduce(0.0, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				System.out.println("1111=>  " + t + ", " + u);
				return t + u;
			}
		});
		
		//2
		double finalResult = Employee.persons().parallelStream()
				.reduce(0.0, 
						new BiFunction<Double, Employee, Double>(){//입력값 double, employee. 반환값 double.

							@Override
							public Double apply(Double t, Employee u) {
								System.out.println("stream " + "t: " + t + ", u: " + u.getIncome());
								return t + u.getIncome();
							}//parallelStream의 경우 개별 stream에서 변경된 값을 합산하는 역할만 한다.
				
						}, 
						new BinaryOperator<Double>() {

							@Override
							public Double apply(Double t, Double u) {
								// TODO Auto-generated method stub
								System.out.println("t : " + t + ", u: " + u);
								return t + u;
							} //parallelStream의 경우에 필요함. 하나의 스트림만 쓰는 stream의 경우 해당 메소드는 필요 없음.
						}
					);
		System.out.println(finalResult);
		
	}
}
