package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Hong", 30),
				new Student("Park", 15),
				new Student("Hwang", 25)
				); 
		//students.stream().sorted().forEach(s -> System.out.println(s));//ClassCaseException에러 발생. 
																	   //=>comparable을 위해 compareTo메소드를 만들기 위해 Student 클래스 변경. 
		List<Person> persons = Arrays.asList(
				new Person("Hong", 30),
				new Person("Hwang", 15),
				new Person("Hwang", 25)
				);
		persons.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.compareTo(o2);
			}
			}).forEach(System.out::println);
		}
	}

