package student;

import java.util.Scanner;

public class StudentService {
	// 학생에 대한 관리(필드)
		// 배열로 학생들을 관리
	static Student[] students = new Student[10];
	int count = Student.count;
	
		// 초기화 블럭에 더미데이터 입력
	static {
		students[0] = new Student(1, "둘리", 90, 70, 85);
		students[1] = new Student(2, "도우너", 88, 62, 82);
		students[2] = new Student(3, "또치", 82, 51, 92);
		students[3] = new Student(4, "고길동", 65, 91, 49);
		students[4] = new Student(5, "고희동", 51, 64, 90);
	}
	// 기능에 대한 관리(CRUD)
		// 학생 추가, 조회, 수정, 삭제
		// 학생 추가
	void add() {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = count; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].snum = count++ + 1;
			System.out.print("이름 > ");
			students[i].sname = scanner.nextLine();
			System.out.print("국어점수 > ");
			students[i].kor = Integer.parseInt(scanner.nextLine());
			System.out.print("영어점수 > ");
			students[i].eng = Integer.parseInt(scanner.nextLine());
			System.out.print("수학점수 > ");
			students[i].math = Integer.parseInt(scanner.nextLine());
			System.out.println("입력이 완료되었습니다.");

			System.out.print("더 입력하시겠습니까? 1. 예 2. 아니오 > ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			if (choice == 2) {
				break;
			}
		}
		System.out.println("메뉴를 다시 선택하세요.");
	}
		// 학생 조회
	void list() {
		System.out.println("-----------------------------------------------------");
		System.out.println(" 학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.println(students[i]);
		}
	}
		// 학생 수정
	void modify() {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		int idx = 0;

		do {
			System.out.print("수정할 데이터의 학번을 입력하세요. > ");
			int num = Integer.parseInt(scanner.nextLine());
			
			for (int i = 0; i < count; i++) {
				if (students[i].snum == num) {
					idx = i;
					System.out.println("-----------------------------------------------------");
					System.out.println(" 학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
					System.out.println("-----------------------------------------------------");
					System.out.println(students[i]);
					break;
				}
			}
			
			System.out.print("찾는 데이터가 맞습니까? 1. 예 2. 아니오 3. 종료 > ");
			choice = Integer.parseInt(scanner.nextLine());
			
			if (choice == 3) {
				return;
			}
			
		} while (choice == 2);
		
		System.out.println("데이터를 다시 입력합니다.");
		System.out.print("이름 > ");
		students[idx].sname = scanner.nextLine();
		System.out.print("국어점수 > ");
		students[idx].kor = Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수 > ");
		students[idx].eng = Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수 > ");
		students[idx].math = Integer.parseInt(scanner.nextLine());
		System.out.println("수정이 완료되었습니다.");
	}
		// 학생 삭제
	void remove() {
		System.out.println("remove()");
	}
}
