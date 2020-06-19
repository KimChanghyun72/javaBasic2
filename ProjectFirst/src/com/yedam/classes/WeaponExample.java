package com.yedam.classes;

public class WeaponExample {
	public static void main(String[] args) {
		Weapon IgnitionSword = new Weapon();
		
		IgnitionSword.Rarity = "Unique";
		IgnitionSword.MinDamage = 300;
		IgnitionSword.MaxDamage = 450;
		IgnitionSword.Range = 1;
		IgnitionSword.AttackSpeed = 10;
		IgnitionSword.PlusStr = 50;
		IgnitionSword.PlusDex = 0;
		IgnitionSword.PlusInt = 50;
		
		System.out.println("작열검의 등급은"+IgnitionSword.Rarity);
		System.out.println("작열검의 공격력은"+IgnitionSword.MinDamage+"~"+IgnitionSword.MaxDamage);
		
		IgnitionSword.masic(IgnitionSword.Rarity);
		IgnitionSword.kinds(IgnitionSword.Range);
		
	}
}
