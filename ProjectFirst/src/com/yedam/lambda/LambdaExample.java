package com.yedam.lambda;
//class MyFuncClass implements MyFunctionalInterface{
//
//	@Override
//	public void run() {
//		System.out.println("실행.");
//		
//	}
//	
//}


public class LambdaExample {
	public static void main(String[] args) {
//		MyFunctionalInterface f1 = new MyFuncClass();
//		f1.run();
//		1)매개값이 없는 인터페이스
		MyFunctionalInterface f1 = new MyFunctionalInterface() {
			//익명구현객체
			@Override
			public void run() {
				System.out.println("   _  _");
				System.out.println("실행`2 `");
			}
			
		};
		f1.run();
		//간단한 람다 표현식. -> run()메소드를 구현하는 부분.
//		MyFunctionalInterface fi2 = ()-> {
//								//매개값  -> 구현
//								//구현 메소드는 run()
//				System.out.println(" |  _  _  |");
//				System.out.println(" |  `2 `  |");
//				System.out.println("  |  ㅡ      | ");
//				
//			
//		};
		MyFunctionalInterface fi2 = ()->System.out.println("실행");
	fi2.run();
	
	// 2) 매개값이 있는 인터페이스
	MySumInterface si = new MySumInterface() {
		
		@Override
		public void sum(int num1, int num2) {
			int result = num1+num2;
			System.out.println("두 수의 합: " + result);
		}
	};
	si.sum(10, 20);
	
	MySumInterface si2 = (int num1, int num2)-> {
		int result = num1 + num2;
		System.out.println("두 수의 합 2:" + result);
	};
	
	si2.sum(10, 20);
	//->인터페이스를 계승하는 거라 sum 메소드가 익명객체에서 작성 안해도 자동으로 나오는구만
	//이러면 인터페이스에 담겨있는 메소드 파악하는 게 정말 중요할 것 같다.
	
	//매개값과 리턴값이 있는 인터페이스
	MyMultiInterface mi = new MyMultiInterface() {
	
		@Override
		public int multi(int num1, int num2) {
			
			return num1 * num2;
		}	
	};
	
//	
	MyMultiInterface mi2 = (num1, num2) -> {
		return num1*num2;
		};
		int result = mi2.multi(10,15);
		System.out.println("결과값은: " + result);
	}//end of main
}//end of class
