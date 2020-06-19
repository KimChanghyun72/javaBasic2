package com.yedam.practice;

public class Util {

	public static <K, V> V getValue(Pair<K, V> str1, String str2) {
		V value = str1.getValue();

		boolean keyCompare = str1.getKey().equals(str2);
		if (keyCompare) {
			return value;
		} else {
			return null;
		}
	}

}