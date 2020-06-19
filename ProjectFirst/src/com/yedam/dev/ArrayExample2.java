package com.yedam.dev;

public class ArrayExample2 {
	public static void main(String[] args) {

		//System.out.println(getLargeValue(10,20));
		int[] exAry = new int[] { 3, 6, 9, 12 };
		int[] intAry = { 1,2,3,4};
		int[] intAry2 = new int[5];
		intAry2 = new int[] {1,2,3,4};
		
		int[][] intAry3 = new int[3][3];
		intAry3[0] = new int[] {1,2,3};
		intAry3[1] = new int[] {4,5,6, 6,6};
		intAry3[2] = new int[] {7,8,9,3,3,3};
		
		System.out.println("intAry3 크기 : " + intAry3.length);
		System.out.println("intAry3[0] 크기 : " + intAry3[0].length);
		System.out.println("intAry3[1] 크기 : " + intAry3[1].length);
		System.out.println("intAry3[2] 크기 : " + intAry3[2].length);
		/*
		intAry3[0][0] = 1; intAry3[0][1] = 2; intAry3[0][2] = 3;
		intAry3[1][0] = 4; intAry3[1][1] = 5; intAry3[1][2] = 6;
		intAry3[2][0] = 7; intAry3[2][1] = 8; intAry3[2][2] = 9;
		
		for(int i=0; i<intAry3.length; i++) {
			for(int j=0; j<intAry3[i].length; j++) {
				System.out.print(intAry3[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		//System.out.println(Integer.MIN_VALUE);

		//System.out.println(getLargeValue(exAry));

		//String result = getString("Hello", "World");
		//System.out.println(result);

		//String[] ary = { "Lee", "Kim", "Park", "Choi", "Han" };

		//System.out.println(getString(ary));
	}//end of main()

	/*public static int getLargeValue2(int a, int b) {
		int answer = 0;
		if(a-b>0) {
			answer = a;
		} else if(a-b<0) {
			answer = b;
		} else {
			answer = 0;
		}
		
		return answer;
	}*/

	/*
	public static String getString(String[] strAry) {
		
		//String message = "null";
		String message = new String("default");
		String message2 = new String("default");
		boolean result;
		for(int i=0; i<strAry.length; i++) {
			//message = message + "-" + strAry[i];
			if(result = message.contentEquals(message2)) {
				message = strAry[i];
			} else {
				message = message + "-" + strAry[i];
			}
		}
		return message;
	}*/

	public static String getString(String[] strAry) {
		String result = "";
		for (int i = 0; i < strAry.length; i++) {
			if ((strAry.length - 1) == i) {
				result += strAry[i];
			} else {

				result += strAry[i] + " - ";
			}
		}
		return result;
	}

	//str1 + str2
	public static String getString(String str1, String str2) {

		return str1 + " - " + str2;
	}

	public static int getLargeValue(int[] ary) {

		int maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < ary.length; i++) {

			if (ary[i] >= maxValue)

				maxValue = ary[i];
		}

		return maxValue;
	}

	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue)
			maxValue = a;
		if (b >= maxValue)
			maxValue = b;
		if (c >= maxValue)
			maxValue = c;
		return maxValue;
	}

	public static int getLargeValue(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
}
