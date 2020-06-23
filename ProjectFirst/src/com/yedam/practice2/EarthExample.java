package com.yedam.practice2;

public class EarthExample {
	public static void main(String[] args) {
	
		System.out.println(Earth.EARTH_RADIUS + "km");
		System.out.println(Earth.EARTH_SURFACE_AREA + " km^2");
	}//end of main
}//end of EarthExample

class Earth{
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	//위에서 바로 초기화 안하고 따로 이렇게 설정하는 이유가 뭐지.
//	static {
//		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	}
}
