package com.yedam.dev;

public class DoubleArray {
	public static void main(String[] args) {
		/*	for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print((j+1)+(i*5)+"\t");
				}
				System.out.println("");
			}
			
			for(int k=0; k<2 ;k++) {
			System.out.println("");
			}
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print((i+1)+(j*5)+"\t");
				}
				System.out.println("");
			}
			*/
			
		int arr[][] = new int[5][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = (5*i + j+1);
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}//1번 끝
		System.out.println("");
		
		int cnt = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				arr[j][i] = cnt;
				cnt++;
			}			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
		
				System.out.print(arr[i][j]+"\t");
				}
			System.out.println("");
		}//2번 끝
			
		
		
	}//end of main
}//end of class