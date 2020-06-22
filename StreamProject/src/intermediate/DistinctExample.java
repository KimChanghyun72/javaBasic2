package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DistinctExample {
	public static void main(String[] args) {
//		IntStream is = IntStream.of(1,2,2,3,3,5,6,5);
//		int sum = 0;
//		sum = is.distinct().peek(System.out::println).sum();//distinct로 중복제거. peek로 중간값 출력, sum으로 중간값 전부 합산.
//			//최종처리 메소드가 있어야지만 중간과정도 실행됨. 최종처리 메소드가 없는 상태를 maze 상태라고 한다.
//		System.out.println("sum: " + sum);
		
		List<Student> list = Arrays.asList(//
				new Student("Hong", 33), //
				new Student("Hong", 33), //
				new Student("Hwang", 37),//
				new Student("Park", 44));//
		list.stream().distinct().forEach(s -> System.out.println(s));//중복제거 되지 않음. 중복판독 기준은 해시코드, equals method인데 이 두 가지가 어떤 기준으로 판단하는지 알아보자.
	}
}
