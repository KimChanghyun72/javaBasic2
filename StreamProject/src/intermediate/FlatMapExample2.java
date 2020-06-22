package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3); 
		stream.flatMap(new Function<Integer, Stream<Integer>>(){

			@Override
			public Stream<Integer> apply(Integer t) {
				
				return Stream.of(t * 2);
			}
			
		}).filter(new Predicate<Integer>() {  //중간처리끼리 순서를 바꾸면 값이 완전히 달라진다는 점은 재미있다.

			@Override
			public boolean test(Integer t) {
				return t > 3;
			}
			
		})
		.forEach(s -> System.out.println(s));
		//stream = Stream.of(1,2,3);
		//stream.flatMap(t -> Stream.of(t*2)).filter(t -> t>3).forEach(s -> System.out.println(s));//축약형
		
		stream = Stream.of(1,2,3); //스트림은 반복자. 한번 쓰면 다시 생성해줘야 한다. (?)
		int sum = stream.flatMapToInt((t) -> IntStream.of(t*2)//아래의 식을 람다식으로 간단하게 변형.
//				new Function<Integer, IntStream>(){
//
//			@Override
//			public IntStream apply(Integer t) {
//				// TODO Auto-generated method stub
//				return IntStream.of(t * 2); //Stream<Integer>.of로 하면 오류남.
//			}}
			
		).sum();
		System.out.println("sum: " + sum);
		
		List<Employee> employees = Employee.persons();
		employees.stream().flatMapToDouble((Employee t) ->DoubleStream.of(t.getIncome())).forEach(s -> System.out.println(s));
	}
}
