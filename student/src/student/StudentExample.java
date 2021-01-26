package student;

import static student.StudentUtils.*;


public class StudentExample {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		
//		s1.snum = 1;
//		s1.sname = "둘리";
//		s1.kor = 90;
//		s1.eng = 70;
//		s1.math = 70;
//		
//		System.out.println("-----------------------------------------------------");
//		System.out.println(" 학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
//		System.out.println("-----------------------------------------------------");
//		System.out.println(s1);
		
		StudentService ss = new StudentService();
		boolean run = true;
		
		while (run) {
			try {
				int input = selectMenu();
				
				switch (input) {
				case 1:
					ss.list();
					break;
				case 2:
					ss.add();
					break;
				case 3:
					ss.modify();
					break;
				case 4:
					ss.remove();
					break;
				case 5:
					ss.sort();
					break;
				case 6:
					return;	// 메인 메서드 종료
				default :
					throw new MyRangeException(1, 6);	
				}
			} catch(NumberFormatException e) {
				System.out.println("정확한 숫자 값을 입력하세요.");
			} catch(MyRangeException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}

