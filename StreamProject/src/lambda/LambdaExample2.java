package lambda;

import java.util.function.ToIntFunction;

public class LambdaExample2 {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			
	};
		
			//avg() method
	//뭘 넣어도 영어평균점수만 나옴.
	//인터페이스를 쓰면 메소드 하나만 있어도 영어평균, 수학평균, 전체평균을 다 볼 수 있지만 인터페이스 매개변수를 쓰지 않으면 메소드가 3개로 늘어난다.
	
	
	//전체평균점수.(영어, 수학)
	public static double avgTotal() {
		int sumOfEng=0;
		int sumOfMath=0;
		for(Student student : students) {
			sumOfEng +=student.getEnglishScore();
			sumOfMath +=student.getMathScore();
		}
		double avgOfEng = (double)sumOfEng/students.length;
		double avgOfMath = (double)sumOfMath/students.length;
		
		return (avgOfEng+avgOfMath)/2;
	}
	
	//영어평균점수
		public static double avg() {
			int sum =0;
			for(Student student : students) {
				sum += student.getEnglishScore();
			}
			return (double)sum / students.length;
		}
		
	//수학평균점수
		
	public static double avgMath() {
		int sum=0;
		for(Student student : students) {
			sum += student.getMathScore();
			
			double avg = (double)sum/students.length;
			return avg;
		}
		
		return 0;
	}
	
	//인터페이스 사용 평균점수
	public static double avg( ToIntFunction<Student> function) {
		
		int sum = 0;
		for(Student student : students) {
			sum +=function.applyAsInt(student); //
		}
		double avg = (double)sum/students.length;
		return avg;
	}
		
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());//student 클래스의 getEnglishScore를 넣겠다.
		double mathAvg = avg( s-> s.getMathScore());
		double totalAvg = avg( s-> (s.getMathScore()+s.getEnglishScore()));
		//double enlistAvg2 = avg();
		//System.out.println(enlistAvg2);
		
		
		System.out.println("영어 평균 점수:" + englishAvg);
		
		System.out.println("수학 평균 점수: " + mathAvg);
		
		System.out.println("합계 평균 점수: " + totalAvg);
		
		double totalAvg2 = avg(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				
				return value.getEnglishScore()+value.getMathScore();
			}
			
		});
		
	}//end of main
	
	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() { return name;}
		public int getEnglishScore() { return englishScore;}
		public int getMathScore() { return mathScore;}
	}

}
