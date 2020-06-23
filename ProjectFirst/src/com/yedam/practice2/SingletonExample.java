package com.yedam.practice2;

public class SingletonExample {
	public static void main(String[] args) {
		
		//Singleton - 단 하나의 객체만을 여러 곳에서 사용해야 할 때 사용하는 방식. 클래스 내부에서 private로 객체를 생성하고 객체를 사용하려면 get메소드를 통해서만 호출할 수 있게 만듬.
		//한 개의 리스트 같은 걸 여러 곳에서 사용할 때 써먹을 수 있을 것 같다. static 변수가 메모리 낭비를 막기 위해 사용되는데 그것과 유사하게 메모리를 효율적으로 사용할 수 있는 방법인 듯.
		
		//Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 singleton 객체입니다.");
		}else {
			System.out.println("다른 singleton 객체입니다.");
		}
	}
}
