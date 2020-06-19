package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권", 92)
				);
				
		Stream<Student> stream = list.stream();
		stream.filter(s -> s.getScore()==92).forEach(s -> System.out.println(s.getName()+" - "+ s.getScore()));
	}//end of main
}//end of class

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}
