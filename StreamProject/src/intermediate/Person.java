package intermediate;

public class Person implements Comparable<Person> {
	 String name;
	 int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		String str = String.format("%s %s", name, age);
		return str;
	}
	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}

	
}
