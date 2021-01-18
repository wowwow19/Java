package exercise_js;

public class Exercise6_5 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
	
	
}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	float getAverage() {
//		return getTotal() / 3f;
		return (int)(getTotal() / 3f * 10 + .5f) / 10f;		// 둘째자리에서 반올림
	}
	
	String info() {
		return this.name + "," + this.ban + "," + this.no + "," + 
		this.kor + "," + this.eng + "," + this.math + "," + this.getTotal() + "," + this.getAverage();
	}
}
