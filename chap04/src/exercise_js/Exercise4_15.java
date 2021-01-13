package exercise_js;

import java.util.Scanner;

public class Exercise4_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int number = scanner.nextInt();
		int tmp = number;
		int result = 0;
		
		while (tmp != 0) {
			result *= 10;
			result += tmp % 10;
//			System.out.println(tmp);
			tmp /= 10;
//			System.out.println(result);
		}
		
		if (number == result) {
			System.out.println(number + "는 회문수입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}
}
