package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class basic {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바");
		
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name));
	}
}
