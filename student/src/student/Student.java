package student;

// API의 대상
public class Student {
	// 학번, 이름, 국어, 영어, 수학
	// 총점, 평균 : 메서드
	int snum;
	String sname;
	int kor;
	int eng;
	int math;
	
	int getTotal() {	// 인스턴스 메서드
		return kor + eng + math;
	}
	
	double getAvg() {
		return getTotal() * 10 / 3 / 10.0;
	}
	
	public String toString() {
		return " " + 
				snum + " \t " +
				sname + " \t " +
				kor + " \t " +
				eng + " \t " +
				math + " \t " +
				getTotal() + " \t " +
				getAvg();
	}
}
