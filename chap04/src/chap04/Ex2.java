package chap04;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = Integer.parseInt(scanner.nextLine());
		String grade = "";
		
//		if (score >= 98) {
//			grade = "A+";
//		} else if (score >= 94) {
//			grade = "A";
//		} else if (score >= 90) {
//			grade = "A-";
//		} else if (score >= 88) {
//			grade = "B+";
//		} else if (score >= 84) {
//			grade = "B";
//		} else if (score >= 80) {
//			grade = "B-";
//		} else if (score >= 76) {
//			grade = "C+";
//		} else if (score >= 74) {
//			grade = "C";
//		} else if (score >= 70) {
//			grade = "C-";
//		} else if (score >= 66) {
//			grade = "D+";
//		} else if (score >= 62) {
//			grade = "D";
//		} else if (score >= 58) {
//			grade = "D-";
//		} else {
//			grade = "F";
//		}
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80){
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		int tmp = score % 10;
		
		if (score >= 60) {
			if (tmp >= 7 || score == 100) {
				grade += "+";
			} else if (tmp <= 2) {
				grade += "-";
			}
		}
		
		System.out.println("점수는 " + score + "입니다.");
		System.out.println("학점은 " + grade + "입니다.");
	}
}
