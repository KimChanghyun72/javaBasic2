package com.yedam.project2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CompareImpl implements CompareInter {

	@Override
	public int[] compare(List<ValueBoard> valueboard, int[] arr) {
		int[] resultInt = new int[3];

		for (int i = 0; i < valueboard.size(); i++) {
			int[] ary1 = new int[3];
			for (int j = 0; j < arr.length; j++) {
				if (valueboard.get(i).getValue() == arr[j]) {
					if (i == j) {
						ary1[i] = 2;
						System.out.print(i + "의" + j +"=" + ary1[i]+ "스트라이크 ");//==
					} else {
						//result[i][j]=1;
						ary1[i] = 1;
						System.out.print(i + "의" + j +"=" +ary1[i]+ "볼, ");//==
					}
				} else {
					//result[i][j]=0;
					ary1[i] = 0;
					System.out.print(i + "의" + j +"=" +ary1[i] + "땡!, ");//===
				}
			}
		
			//Arrays.sort(ary1);
			//resultInt[i]=ary1[2];
			resultInt[i] = Math.max(Math.max(ary1[0], ary1[1]), ary1[2]);
			System.out.println(resultInt[i]);//==
		}
		
		return resultInt;
		//		for(int i=0; i<result[i].length; i++) {
		//			result2[i] = Math.max(Math.max(result[i][1],result[i][0]), result[i][2]);
		//		}
		//		
		//		return result2;
	}

	@Override
	public void insert(List<ValueBoard> list, ValueBoard valueboard) {
		list.add(valueboard);

	}

}
