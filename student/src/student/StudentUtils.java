package student;

import java.util.Scanner;
import static student.StudentService.*;

public class StudentUtils {
	
	private static Scanner scanner = new Scanner(System.in);

	public static String nextLine() {
		return scanner.nextLine();
	}
	
	public static int nextInt() {
		return Integer.parseInt(scanner.nextLine());
	}
	
	
	public static void updateData(int idx) {
		System.out.print("학번(기존값:" + students.get(idx).getSnum() + ") > ");
		students.get(idx).setSnum(nextInt());
		System.out.print("이름(기존값:" + students.get(idx).getSname() + ") > ");
		students.get(idx).setSname(nextLine());
		System.out.print("국어점수(기존값:" + students.get(idx).getKor() + ") > ");
		students.get(idx).setKor(checkScore(nextInt()));
		System.out.print("영어점수(기존값:" + students.get(idx).getEng() + ") > ");
		students.get(idx).setEng(checkScore(nextInt()));
		System.out.print("수학점수(기존값:" + students.get(idx).getMath() + ") > ");
		students.get(idx).setMath(checkScore(nextInt()));
	}
	
	public static void deleteData(int idx) {
		students.remove(idx);
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
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getSnum() == num) {
				idx = i;
				printTopBar();
				System.out.println(students.get(i));
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
