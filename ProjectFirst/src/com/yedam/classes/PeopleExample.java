package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		
	
	People kim = new People();
	kim.age = 29;
	kim.height = 176;
	kim.degree = "master";
	
	kim.Sleep();
	kim.Like("Beef");
	kim.showInfo();
	
	People p1 = new People("docter");
	p1.age = 35;
	p1.height = 173;
	
	People p2 = new People("high_school");
	p2.age = 22;
	p2.height = 182;
	
	People p3 = new People("colleage");
	p3.age = 24;
	p3.height = 178;
	
	People[] pAry = new People[4];
	
	pAry[0]=kim;
	pAry[1]=p1;
	pAry[2]=p2;
	pAry[3]=p3;
	
	for(People num : pAry) {
		System.out.println(num.age + ", "+ num.degree);
	}
	}//end of main
}
