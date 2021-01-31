package student;

import java.util.Scanner;
import static student.StudentService.*;
import static student.StudentUtils.nextInt;
import static student.StudentUtils.printMenu;

public class StudentUtils {
	
	private static Scanner scanner = new Scanner(System.in);

	public static String nextLine() {
		return scanner.nextLine();
	}
	
	public static int nextInt() {
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static void insertData(int idx) {
		System.out.print("이름 > ");
		students[idx].setSname(insertName());
		System.out.print("국어점수 > ");
		students[idx].setKor(checkScore(nextInt()));
		System.out.print("영어점수 > ");
		students[idx].setEng(checkScore(nextInt()));
		System.out.print("수학점수 > ");
		students[idx].setMath(checkScore(nextInt()));
	}
	
	public static void updateData(int idx) {
		System.out.print("이름(기존값:" + students[idx].getSname() + ") > ");
		students[idx].setSname(nextLine());
		System.out.print("국어점수(기존값:" + students[idx].getKor() + ") > ");
		students[idx].setKor(checkScore(nextInt()));
		System.out.print("영어점수(기존값:" + students[idx].getEng() + ") > ");
		students[idx].setEng(checkScore(nextInt()));
		System.out.print("수학점수(기존값:" + students[idx].getMath() + ") > ");
		students[idx].setMath(checkScore(nextInt()));
	}
	
	public static void deleteData(int idx) {
		students[idx] = null;
		for (int i = idx+1; i < count; i++) {
			students[i-1] = students[i];
			students[i-1].setSnum(students[i-1].getSnum()-1);
		}
		count--;
	}
	
	public static void printTopBar() {
		System.out.println("-----------------------------------------------------");
		System.out.println(" 학번 \t 이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("-----------------------------------------------------");
	}
	
	public static void printMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("1. 조회 2. 추가 3. 수정 4. 삭제 5. 정렬 6. 종료");
		System.out.println("-----------------------------------------");
	}
	
	public static int findByNo(int num) {
		int idx = 0;
		for (int i = 0; i < count; i++) {
			if (students[i].getSnum() == num) {
				idx = i;
				printTopBar();
				System.out.println(students[i]);
				return idx;
			}
		}
		return -1;
	}
	
	public static int findByName(String name) {
		int idx = 0;
		for (int i = 0; i < count; i++) {
			if (students[i].getSname().equals(name)) {
				idx = i;
				printTopBar();
				System.out.println(students[i]);
				return idx;
			}
		}
		return -1;
	}
	
	public static int checkScore(int score) {
		try {
			if (score < 0 || score > 100) {
				MyRangeException e = new MyRangeException(0, 100);
				throw e;
			}
		} catch(Exception e) {
			System.out.println(e.getMessage() + " 초기값(0)으로 입력되었습니다.");
			return 0;
		}
		return score;
	}
	
	public static int selectMenu() {
		int input = 0;
		printMenu();
		System.out.print("선택 > ");
		input = nextInt();				
		return input;
	}
	
	public static Student[] bubbleSort() {
		Student[] tmpStudents = students.clone();
		for (int i = 0; i < count-1; i++) {
			boolean changed = false;
			
			for (int j = 0; j < count-1-i; j++) {
				if (tmpStudents[j].getTotal() < tmpStudents[j+1].getTotal()) {
					Student tmp = tmpStudents[j];
					tmpStudents[j] = tmpStudents[j+1];
					tmpStudents[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		return tmpStudents;
	}
	
	public static String insertName() {
		String name = nextLine();
		String result = "";
		if (name.length() > 4) {
			for (int i = 0; i < 3; i++) {
				result += name.charAt(i);
			}
			return result += ">";
		} else {
			return name;
		}
	}
}
