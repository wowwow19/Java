package chap04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);		// ctrl + shift + o : import 자동화
		
		String inputString;
		
		do {
			System.out.print("> ");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		scanner.close(); 								// scanner 경고 제거 : 프로그램 종료와 함께 자원 반납
	}
}
