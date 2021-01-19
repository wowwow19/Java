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
	
	public static void insertData(int idx) {
		System.out.print("이름 > ");
		students[idx].setSname(nextLine());
		System.out.print("국어점수 > ");
		students[idx].setKor(nextInt());
		System.out.print("영어점수 > ");
		students[idx].setEng(nextInt());
		System.out.print("수학점수 > ");
		students[idx].setMath(nextInt());
	}
	
	public static void updateData(int idx) {
		System.out.print("이름(기존값:" + students[idx].getSname() + ") > ");
		students[idx].setSname(nextLine());
		System.out.print("국어점수(기존값:" + students[idx].getKor() + ") > ");
		students[idx].setKor(nextInt());
		System.out.print("영어점수(기존값:" + students[idx].getEng() + ") > ");
		students[idx].setEng(nextInt());
		System.out.print("수학점수(기존값:" + students[idx].getMath() + ") > ");
		students[idx].setMath(nextInt());
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

}
