package terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList(
				"Abby", "Charlie","Choi");
		List<String> filterList = strList.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.startsWith("C");
			}
			
		}).collect(Collectors.toList());//collector interface를 직접 구현하기엔 힘들어서 구현을 쉽게하는 collectors 클래스를 사용한다.
		filterList.stream().forEach(s -> System.out.println(s));
		System.out.println();
		
		List<Student> students = Arrays.asList(
				new Student("Hong", 34, Student.Sex.MALE),
				new Student("Hwang", 22, Student.Sex.FEMALE),
				new Student("Park", 33, Student.Sex.MALE),
				new Student("Choi", 44, Student.Sex.FEMALE)
				);
		List<Student> maleStudent = students.stream()
		.filter(s -> s.getSex() == Student.Sex.MALE)
		.collect(Collectors.toList());					//toList로 male만 필터된 내용이  malestudent 구성요소들로 바뀔 줄 알았는데 그게 아니네. 예들 매커니즘이 궁금하네. 
//		
		for(int i=0; i<maleStudent.size(); i++) {
			System.out.println(maleStudent.get(i).getSex());
		}
		
		long cnt = maleStudent.stream().peek(s -> System.out.println(s.getName()))
		.count();
		System.out.println("총 " + cnt + "명");
		
		HashSet<Student> femaleSet = students.stream().filter(s -> s.getSex() == Student.Sex.FEMALE)
		.peek(s -> System.out.println(s.getName()))
		.collect(Collectors.toCollection(new Supplier<HashSet>() {
			@Override
			public HashSet get() { //HashSet? ->supplier 다음에 올 수 있는 것은 collection 타입이다.(?)
				// TODO Auto-generated method stub
				return new HashSet<Student>();
			}
		}));
		int result = femaleSet.stream().map(new Function<Student, Integer>(){
			@Override
			public Integer apply(Student t) {
				// TODO Auto-generated method stub
				return t.getScore();
			}
		}).reduce(0, //집계
				new BinaryOperator<Integer>() {

					@Override
					public Integer apply(Integer t, Integer u) {
						// TODO Auto-generated method stub
						return t + u;
					}
			
		});
		System.out.println("합은: " + result);
		
	}//end of main
}//end of class
