package chap04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.(1 ~ 12)");
		int input = Integer.parseInt(scanner.nextLine());
		
//		if (input >= 9 && input <= 11) {
//			System.out.println("가을입니다.");
//		} else if (input >= 6 && input <= 8) {
//			System.out.println("여름입니다.");
//		} else if (input >= 3 && input <= 5) {
//			System.out.println("봄입니다.");
//		} else if (input == 12 || input >= 1 && input <= 2) {
//			System.out.println("겨울입니다.");
//		} else {
//			System.out.println("잘못입력했습니다.");
//		}
		
		switch (input) {
			case 3 : case 4 : case 5 :
				System.out.println("봄입니다.");
				break;
			case 6 : case 7 : case 8 :
				System.out.println("여름입니다.");
				break;
			case 9 : case 10 : case 11 :
				System.out.println("가을입니다.");
				break;
			case 1 : case 2 : case 12 :
				System.out.println("겨울입니다.");
				break;
			default : 
				System.out.println("1과 12까지의 숫자만 입력하세요.");
		}
	}
}
