package intermediate;

import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample {
	public static void main(String[] args) {
//		Stream.of(1,2,3).flatMap(new Function<Integer, Stream<Integer>>(){//flatMap의 구성을 읽어보고 function구현 이해하기.
//
//			@Override
//			public Stream<Integer> apply(Integer t) {
//				return Stream.of(t, t * 2, t * t);//처음의 1,2,3을 대입받은 것을 각각에 대해 t, t*2가 나오도록 변경해서 뿌려줌. == 요소를 대체하는 복수 개의 요소들로 구성된 새로운 스트림.
//			}
//		}).forEach(s -> System.out.println(s));
//
//		Stream.of(1,2,3).flatMapToInt(new Function<Integer, IntStream>(){
//
//			@Override
//			public IntStream apply(Integer t) {
//				return IntStream.of(t*2);
//			}
//			
//		}).forEach(s -> System.out.println(s));
//		
		double sum = Employee.persons().stream().flatMapToDouble((t) -> DoubleStream.of(t.getIncome())).sum();
		System.out.println("sum: " + sum);
		
	}//end of main
}//end of MappingExample
