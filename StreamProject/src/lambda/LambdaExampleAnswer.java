package lambda;

import java.util.function.IntBinaryOperator;

class GetMax implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left>right ? left : right ;
	}
}

class GetMin implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left<right ? left : right ;
	}
}

public class LambdaExampleAnswer {
	private static int[] scores = {10, 50, 3};
	

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores){
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result1 = maxOrMin(new GetMax());
		int result2 = maxOrMin(new GetMin());
		int result3 = maxOrMin((left, right) -> left > right? left : right); //== result1
		int result4 = maxOrMin((left, right) -> left < right? left : right); //== result2
		System.out.println("최대값은: " + result1);
		System.out.println("최소값은: " + result2);
	}
}
