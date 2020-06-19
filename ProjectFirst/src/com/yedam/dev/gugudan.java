package com.yedam.dev;

public class gugudan {
	public static void main(String[] args) {
		/*for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print(j + 1 + "*" + i + "=" + (j + 1) * i + "\t");
			}
			System.out.println("");
		}*/
		/*for(int i=2;i<=9;i++) {
			int j=1;
			System.out.println(i + "*" + j + "=" + j*i);
			j++;
		}*/
		int j=1;
		while(j<=9) {
		for(int i=2;i<=9;i++) {
			System.out.print(i+"*"+j+"="+j*i+"\t");
		}
		System.out.println("");
		j++;
		}
	}
}
