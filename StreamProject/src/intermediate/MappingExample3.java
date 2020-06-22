package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample3 {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		double[] doubleAry = {1.1, 2.3, 3.5, 4.2, 5.5};
		
		IntStream intStream = Arrays.stream(intAry);   //IntStream. 매개값으로 들어온 배열의 type에 따라 다른 stream을 생성함.
		DoubleStream doubleStream = Arrays.stream(doubleAry);//DoubleStream
		
		//intStream.asDoubleStream().forEach(s -> System.out.println(s));
		intStream = Arrays.stream(intAry);
		//intStream.asLongStream().forEach(System.out::println);
		
		intStream = Arrays.stream(intAry);
		Stream<Integer> iStream = intStream.boxed(); //해당되는 기본타입 스트림을 객체형 스트림으로 변경함.
		iStream.forEach(s -> System.out.println(s));
	}
}
