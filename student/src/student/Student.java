package student;

import static student.StudentService.*;

// API의 대상
public class Student {
	// 학번, 이름, 국어, 영어, 수학
	// 총점, 평균 : 메서드
	private int snum;
	private String sname;
	private int kor;
	private int eng;
	private int math;
	
	{
		count++;
	}
	
	public int getSnum() {
		return snum;
	}

	public String getSname() {
		return sname;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
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
	
	Student() {
		this(count + 1, null, 0, 0, 0);
	}
	
	Student(int snum, String sname, int kor, int eng, int math) {
		this.snum = snum;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 210118
	// 1. 기본데이터 더미데이터로 초기화 블럭으로 옮기기
	// 2. 수정 로직 작성(학번 값 입력하여 이름, 점수값 수정)
	// 3. 생성자 오버로딩으로 제작(기본, 5개의 파라미터)
	
	// 210119
	// 1. 삭제로직 구현
	// 2. Student의 모든 필드에 대해 private로 변경, 필요에 따라 getter, setter 추가
	
	
}
