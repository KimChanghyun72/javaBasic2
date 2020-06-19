package com.yedam.generic;
//타입이 아직 안 정해진 제네릭 타입을 입력받을 경우 제네릭 타입을 선언하기 위해 메소드 명 앞뒤로 <T> 를 선언해준다.
public class Utils {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyComp = p1.getKey().equals(p2.getKey());
		boolean valComp = p1.getValue().equals(p2.getValue());
		
		return keyComp&&valComp;
	}
	
	public static <T extends Number> int compare(T t1, T t2){
		
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		
		
		return Double.compare(d1, d2);//앞의 값이 크면 1, 작으면 -1 반환
	}
}
