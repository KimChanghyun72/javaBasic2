package com.yedam.dev;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int num =0;
		
		for(int i =0; i<array.length;i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];//00 01 10 11 12 20 21 22 23 24
				num++;
			}
			//num += ary[i].length;//2,3,5=>10
		}
		avg = (double)sum/num;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}

