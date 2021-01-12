package chap04;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("글자 하나를 입력하세요.");
		
		// 숫자일 경우 : 양수, 0
		// 영문일 경우 : 대문자, 소문자
		// 한글일 경우
		
		int input = (int)(scanner.nextLine().charAt(0));
//		System.out.println((int)('가')); // 한글 44032 ~
//		System.out.println((int)('힣')); // 55203
//		System.out.println((int)('a')); // 소문자 97 ~ 122
//		System.out.println((int)('z')); // 
//		System.out.println((int)('A')); // 대문자 65 ~ 90
//		System.out.println((int)('Z')); // 
//		System.out.println((int)('0')); // 숫자 48 ~ 57
//		System.out.println((int)('9')); // 
		
		if (input >= 44032 && input <= 55203) {
			System.out.println("한글입니다.");
		} else if (input >= 97 && input <= 122) {
			System.out.println("영문 소문자입니다.");
		} else if (input >= 65 && input <= 90) {
			System.out.println("영문 대문자입니다.");
		} else if (input >= 49 && input <= 57) {
			System.out.println("숫자입니다.");
		} else if (input == 48) {
			System.out.println("숫자 0입니다.");
		} else {
			System.out.println("알 수 없습니다.");
		}
		
	}
}
