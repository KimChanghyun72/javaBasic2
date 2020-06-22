package lambda;

import java.util.function.UnaryOperator;

public class LambdaExample3 {
	public static void main(String[] args) {
		UnaryOperator<String> uo = new UnaryOperator<String>() {//unaryoperator?

			@Override
			public String apply(String t) {
				return t.toLowerCase();
				//return t.substring(t.length() - 3);
			}
		};
		System.out.println(uo.apply("HelloWorldNice"));
	}
}
