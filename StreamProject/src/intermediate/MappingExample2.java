package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.*;

public class MappingExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
//		employees.stream().map((Employee t) -> t.getName()).filter(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.startsWith("H");//H로 시작하는 값. //employee 스트림->employee를 string(getName)으로->h로 시작하는 것만(startWith)->forEach
//			}
//		}).forEach(s -> System.out.println(s));
		
		employees.stream().map(new Function<Employee, String>(){ //flapMap와 map의 차이 읽어보기.

			@Override
			public String apply(Employee t) {
				return t.getName();
			}
		}).flatMap(new Function<String, Stream<Character>>(){

			@Override
			public Stream<Character> apply(String t) {
				// TODO Auto-generated method stub
				return IntStream.range(0, t.length()) //. 목표는 character type.
						.mapToObj(new IntFunction<Character>() {//mapToObj가 char stream을 만들어줌.

					@Override
					public Character apply(int value) { //int를 넣으면 이걸 t의 int번째로 리턴해준다.
						// TODO Auto-generated method stub
						
						return t.charAt(value); //charAt(몇번째에 있는 char 선택)
					}
					
				});
			}
		}).forEach(s -> System.out.println(s));
	// ==employees.stream().map(t -> t.getName()).flatMap((String t) -> IntStream.range(0, t.length()).mapToObj((int v) -> t.charAt(v))).forEach(s -> System.out.println(s));	
	
	employees.stream().map((t) -> t.getName()).flatMap(t -> IntStream.range(0,  t.length()).mapToObj(value -> t.charAt(value))).forEach(s -> System.out.println(s));
	//마지막에 char형으로 바꿔주고 싶은데 char형이 없으니까 obj형을 써서 char를 넣어준듯.
	}
	}

