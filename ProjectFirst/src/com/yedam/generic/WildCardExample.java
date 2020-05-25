package com.yedam.generic;
//<T>
// <?>, <? extends class>, <super class>
//Person -> Worker
//		 -> Student -> HighStudent
//Course<T>

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		//Course<Person>, Course<Worker>, Course<Student>, Course<HighStudent>
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
		//배열에 들어있는 값들을 []로 감싼 문자열 값으로 리턴한다는 의미
	}
	
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인과정",5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));
		
		Course<Worker> courseWorker = new Course<Worker>("직장인과정", 5);
		//courseWorker.add(new Person("일반인")); //자식 클래스 제네릭 변수에 부모 클래스가 올 수 없다.
		courseWorker.add(new Worker("직장인"));
		
		Course<Student> courseStudent = new Course<Student>("학생과정", 5);
		courseStudent.add(new Student("학생"));
		//courseStudent.add(new Worker("직장인")); 
		courseStudent.add(new HighStudent("고등학생"));
		
		Course<HighStudent> courseHigh = new Course<HighStudent>("고등학생과정", 5);
		courseHigh.add(new HighStudent("고등학생"));
		
		//Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);
		
		//Course<? extends class> class를 상속받는 하위값만 매개값으로 받겠단 의미
//		registerStudent(coursePerson);
//		registerStudent(courseWorker);
		registerStudent(courseStudent);
		registerStudent(courseHigh);
		
		//Course<? super class>
		registerWorker(coursePerson);
		registerWorker(courseWorker);
//		registerWorker(courseStudent);
//		registerWorker(courseHigh);
	}
}
