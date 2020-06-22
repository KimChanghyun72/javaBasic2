package lambda;

import java.util.function.IntBinaryOperator;

public class LambdaExample1 {
	private static int[] scores = { 10, 50, 3 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score); //applyAsInt를 통해 배열 scores의 개별값인 score를 비교 대상값인 result와 비교하여operator 연산을 실행한 결과값
		}												 //을 result에 대입해서 result를 출력한다.
														 
		return result;
		
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((a,b) -> {		//operator 연산 부분의 실제 실행 연산을 입력하는 작업.
			if(a>=b) return a;
			else return b;
		});
		
		System.out.println("최대값: " + max);
				
		int min = maxOrMin((a,b) -> {
			if(a<=b) return a;
			else return b;
		});
		
		System.out.println("최소값: "+ min);
	} 
}
