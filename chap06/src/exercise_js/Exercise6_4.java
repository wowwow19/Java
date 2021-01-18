package exercise_js;

public class Exercise6_4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}
	
	
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
		
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	float getAverage() {
//		return getTotal() / 3f;
		return (int)(getTotal() / 3f * 10 + .5f) / 10f;		// 둘째자리에서 반올림
	}
}
