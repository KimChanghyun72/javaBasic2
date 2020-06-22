package basic;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(11, 20);	//11이상 20미만 //임포트 받을 때 .class해주면 임포트가 되네.
		//IntStream stream 2 = IntStream.rangeCloesd(11,20) //11이상 20이하
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value%2 == 1;
			}
		};
		//stream.filter(s -> s%2 == 1).forEach(s -> System.out.println(s));
		
		Random random = new Random();
		IntStream intStream = random.ints(10, 11, 100);
		intStream.forEach(s -> System.out.println(s));
		System.out.println(" ");
		IntStream intStream2 = random.ints(10, 50, 60);
		//intStream2.forEach(s -> System.out.println(s));
		
		IntConsumer action = new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println(value);
			}
			
		};
		intStream2.forEach(action);
	}
}
