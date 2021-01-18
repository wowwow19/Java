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
	static int count;
	
	{
		count++;
	}
	
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
	
	Student() {}
	
	Student(int snum, String sname, int kor, int eng, int math) {
		this.snum = snum;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 1. 기본데이터 더미데이터로 초기화 블럭으로 옮기기
	// 2. 수정 로직 작성(학번 값 입력하여 이름, 점수값 수정)
	// 3. 생성자 오버로딩으로 제작(기본, 5개의 파라미터)
}
