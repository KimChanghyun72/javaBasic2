package intermediate;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	public int getScore() {
		return score;
	}


	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}//이름의 해시코드(String)과 스코어를 반환하도록 정의 
	//obj형의 hashcode와 string형의 hashcode는 규정 방식이 다르다.obj형의 해시코드 분류기준을 단순화해서 문자의 hashcode와 score만 비교하도록 변경한 것.

	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score==std.score;
		return stdBool && scoreBool;
	}

	@Override
	public int compareTo(Student o) {
		
		//return this.score - o.score;//점수 기준//-1(음수) 오름차순//1(양수) 내림차순//0 equal.
		return this.name.compareTo(o.name);						
					
	}
	
	
}
