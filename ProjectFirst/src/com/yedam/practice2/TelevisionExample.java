package com.yedam.practice2;

public class TelevisionExample {
	public static void main(String[] args) {
		System.out.println(Television.info);
	}
}
class Television{
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//정적 변수는 생성자를 통한 초기화가 이루어지지 않기 때문에 따로 정적 블록을 선언해야 한다. 다만 초기화가 어떤 때에 필요한 건지 그 사례를 잘 모르겠다
	//https://m.blog.naver.com/PostView.nhn?blogId=fantaxis&logNo=120121594514&proxyReferer=https:%2F%2Fwww.google.com%2F.
	static {
		info = company + "-" + model;
	}
}
