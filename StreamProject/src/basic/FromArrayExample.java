package basic;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strAry = {"Hong", "Hwang", "Park"};
		//==Arrays.stream(strAry);
		Stream<String> stream = Arrays.stream(strAry);
		stream.peek(new Consumer<String>() {	//peek는 한 건에 대하여 최종처리까지 다 하는 구문. (??)
			@Override							//db에서 조건을 걸어서 가져올 때 쿼리문 대신 필터링 할 수 있음.
			public void accept(String t) {
				System.out.println("peek: " + t.toString());
			}
			
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("forEach: " + t.toString());
			}
			
		});
	}
}
