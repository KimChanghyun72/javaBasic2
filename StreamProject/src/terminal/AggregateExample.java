package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n>=5).average();
		double result;
		
		od.ifPresent(new DoubleConsumer() {//해당하는 값이 있으면 처리 발생. 없으면 아무일도 없음.

			@Override
			public void accept(double value) {
				System.out.println("결과는: " + value);				
				
			}
		});
		
		//방법2
//		result = od.orElse(0.0);//값이 지정되어 있지 않을경우 default값 지정
//		System.out.println(result);
		
		//방법1
//		if(od.isPresent()) {
//		result = od.getAsDouble();//=>나오는 요소가 없으면 오류 발생.
//		System.out.println(result);
//		}else {
//			System.out.println("값이 없습니다.");
//		}
	}
}
