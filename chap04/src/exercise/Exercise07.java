package exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 > ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1 :
				System.out.print("예금액 > ");
				balance += scanner.nextInt();
				break;
			case 2 :
				System.out.print("출금액 > ");
				int withDrawal = scanner.nextInt();
				if (withDrawal > balance) {
					System.out.println("출금할 수 없습니다.");
				} else {
					balance -= withDrawal;
				}
				break;
			case 3 :
				System.out.println("잔고 > " + balance);
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default :
				System.out.println("잘못입력했습니다.");
			}
		}
	}
}
