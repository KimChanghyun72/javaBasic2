package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample {
	static int sum = 0;//왜 main method 안에 sum이 있으면 오류나고 클래스의 필드로 빼서 정적값으로 넣으면 오류가 안날까?
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		for(int n : numbers) {
			if(n%2==1) {
				int square = n * n;
				sum += square;
			}
		}
		System.out.println("결과: " + sum);
		//numbers.stream().forEach(s -> System.out.print(" " +s + " "));
		
		Predicate<Integer> predicate = (t)-> t%2 == 1; 
		Function<Integer, Integer> function = new Function<Integer, Integer>(){
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}//function을 입력값의 제곱값을 리턴하도록 정의.
			
		};//입력값 integer, 출력값 integer인 함수 function.
		
		sum=0;
		//numbers.stream().filter(predicate).forEach(s -> System.out.println(s));
		//필터 조건을 통해 걸러냄.
		//numbers.stream().filter((t)-> t%2 == 1).forEach(s -> System.out.println(s));
		//predicate의 람다식을 바로 filter의 조건에 넣을수도 있다.
		numbers.stream().filter((t)-> t%2 == 1).map(function).forEach(s -> sum += s);
		//map?
		//==numbers.stream().filter((t)-> t%2 == 1).map(t->t*t).forEach(s -> sum += s);
		System.out.println("결과: " + sum);
	}
}
