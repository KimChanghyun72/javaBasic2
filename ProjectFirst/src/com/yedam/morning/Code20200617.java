package com.yedam.morning;

import java.util.ArrayList;
import java.util.List;

public class Code20200617 {
	public static void main(String[] args) {
		int size = 20;
		int [] array = new int[size];
		int [] compArray = new int[size];
		List<Integer> randNumList = new ArrayList();
		
		for(int i=0; i<size; i++) {//난수 리스트에 값 채워넣기.
			randNumList.add(i+1);
		}
		
		
		for(int i=0; i<size; i++) {//array에 입력.
			int randomNumIndex = (int)((Math.random()*(randNumList.size())));
			int randomNumber = randNumList.get(randomNumIndex);
			array[i] = randomNumber;
			for(int j= 0; j<randNumList.size(); j++) {
				if(randNumList.get(j)==randomNumber) {
					randNumList.remove(j);
				}
			}
		//	System.out.println(array[i]);
		}
		
		int[] a = new int[3];
		for (int i = 0; i <= 2; i++) {
			a[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) { // 중복 제거
					a[i] = (int) (Math.random() * 10);
					j = -1;		//for문 조건을 뒤로 돌린다는 게 신박하다.
				}
			}
			//System.out.println(a[i]);
		}
		size = 6;
		
		int[] thirdAry = new int[size];
		for(int i=0; i<size; i++) {
			thirdAry[i]= (int)((Math.random()*45)+1);
			for(int j=0; j<i; j++) {
				if(thirdAry[i]==thirdAry[j]) {
					thirdAry[i] =  (int) ((Math.random() * 45)+1);
					j=-1;
				}
			}
			System.out.println(thirdAry[i]);
		}
		
		
	}//end of main
}//end of code20200617
		
//현업 뛰다 온 사람은 다르구나. 이중포문/일중포문으로 둘 다 구현 가능한 점, 배열의 길이를 상수를 쓰지 않고 변수로 넣는 점, 	
//값을 넣고, 넣은 값에서 같은게 나온다면 i--해서 되돌려서 다시 값을 넣는다? 신박하다.
//아니 비효율적이라고 생각되긴 하는데. 야 이거 리스트 그림으로 해서 생각해봐. i--하는 거 신박하다.
//문제점 : 비교 대상(list[2])이랑 비교해서 새로 나온 난수값이 이전에 비교했던 비교값(list[1])과 같은 경우. 
//난수 풀을 조작해버려. mathrandom으로 가져오는 게 아니라 배열 만들어서 거기서 랜덤값을 가져오게 하고 나온 수는 리스트 내부의 값에서 지워버리면 안나올거아냐.
//난수풀이 들어간 리스트 하나 생성. 값이 들어갈 리스트에 무슨 수가 들어갈지는 난수풀 리스트의 인덱스를 난수값으로 생성하고.
//단지 math.random에 곱할 수를 리스트 사이즈로 제한하면 나중에 난수풀 값을 삭제해도 문제가 없을거야.