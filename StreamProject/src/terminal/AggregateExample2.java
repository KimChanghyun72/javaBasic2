package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

import intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Hong", 55), 
				new Student("Hwang", 67), 
				new Student("Park", 88),
				new Student("Kim", 77),
				new Student("Lee", 35),
				new Student("Hawaii", 99)
				);
		
		int result = students.stream().mapToInt(new ToIntFunction<Student>() { //map -> 요소를 다른 요소로 바꿔줌. //mapToInt->요소를 int형의 무언가로 바꿔줌.
			@Override
			public int applyAsInt(Student value) {
				
				return value.getScore();
			}
		}).sum(); //students....끝까지 쭉 만들고 값이 int형으로 나오니까 int result = 를 선언해주는군.
		System.out.println("집계결과: " + result);
		
		students.stream().mapToInt(s -> s.getScore()).reduce(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", right: " + right);
				return left + right;//seed값? ->0 초기값 말하는듯.
			}
		}).getAsInt();
		System.out.println("집계결과2: " + result);
		
		
		result = students.stream().filter(n -> n.getScore()>100).mapToInt(s -> s.getScore())
		.reduce(0, new IntBinaryOperator() { //filter에 100초과로 제한값을 줘서 오류발생.
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", right: " + right);
				return left + right;//seed값? ->0 초기값 말하는듯.
			}
		}); //getAsInt가 필요없는걸 보니 초기값 int형이 들어가니까 기본적으로 int형으로 되게 설정된건가.
		System.out.println("집계결과2: " + result);
		
	}//end of main
}//end of class
