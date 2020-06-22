package Exam;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Note {
	public static void main(String[] args) {
		int[] Ary = new int[] {3,2,5,7,1};
		
		IntStream streamAry = Arrays.stream(Ary);
		
		streamAry.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//IntStream.of(2,4,6,8,10,12,14,16,18,20).sum();
		int sum = IntStream.rangeClosed(1, 20).filter(s -> s%2==0).peek(s->System.out.print(s + " ")).sum();
		System.out.println();
		System.out.println("결과: " + sum);
		
	}//end of main
}
