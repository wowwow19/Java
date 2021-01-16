package student;

import java.util.Scanner;

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
		
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		boolean run = true;
		
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 조회 2. 추가 3. 수정 4. 삭제 5. 정렬 6. 종료");
			System.out.println("-----------------------------------------");
			int input = Integer.parseInt(scanner.nextLine());
			
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
				System.out.println("준비 중입니다.");
				break;
			case 6:
				return;	// 메인 메서드 종료
			}
		}
		scanner.close();
	}
}
