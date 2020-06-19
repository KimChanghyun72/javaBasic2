package com.yedam.classes;

public class Weapon {

	String Rarity;
	int MinDamage;
	int MaxDamage;
	int Range;
	int AttackSpeed;
	int PlusStr;
	int PlusDex;
	int PlusInt;
	
	void masic(String Rarity) {
		if(Rarity.equals("Unique")) {
			System.out.println("마법 염룡살진을 사용할 수 있습니다.");
		} else {
			System.out.println("마법 불꽃세례를 사용할 수 있습니다.");
		}
	}
	void kinds(int Range) {
		if(Range<=3) {
			System.out.println("근접무기입니다.");
		}else {
			System.out.println("원거리무기입니다.");
		}
	}
}
