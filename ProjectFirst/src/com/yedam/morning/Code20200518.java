package com.yedam.morning;

public class Code20200518 {
	public static void main(String[] args) {
		int[] ary = { 10, 8, 5, 3, 7, 1 };

		int temp;
		for (int j = 0; j < ary.length - 1; j++) {
			for (int i = 0; i < (ary.length - 1); i++) {
				if (ary[i] > ary[i + 1]) {
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;

				}
			}
		}
		/*		
				for (int i = 0; i < (ary.length - 1); i++) {
					if (ary[i] > ary[i + 1]) {
						temp = ary[i];
						ary[i] = ary[i + 1];
						ary[i + 1] = temp;
		
					}
				}
		*/			
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);

		}

	}//end of main
}//end of class
