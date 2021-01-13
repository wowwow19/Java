package chap04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요.");
		int user = Integer.parseInt(scanner.nextLine());
		int com = (int)(Math.random() * 3) + 1;
		int diff = user - com;
		
		System.out.println("당신은 " + (user == 1 ? "가위" : user == 2 ? "바위" : "보") + "를 냈습니다.");
		System.out.println("컴퓨터는 " + (com == 1 ? "가위" : com == 2 ? "바위" : "보") + "를 냈습니다.");
		
		switch (diff) {
			case 1 : case -2 :
				System.out.println("당신이 이겼습니다.");
				break;
			case 0 :
				System.out.println("비겼습니다.");
				break;
			default :
				System.out.println("당신이 졌습니다.");
				break;
		}
		
//		if (user > com) {
//			if (user == 3 && com == 1) {
//				System.out.println("당신이 졌습니다.");
//			} else {
//				System.out.println("당신이 이겼습니다.");
//			}
//		} else if (com > user) {
//			if (com == 3 && com == 1) {
//				System.out.println("당신이 이겼습니다.");
//			} else {
//				System.out.println("당신이 졌습니다.");
//			}
//		} else {
//			System.out.println("비겼습니다.");
//		}	
		
//		switch (user - com) {
//		case 1 : case -2 :
//			System.out.println("당신이 이겼습니다.");
//			break;
//		case 0 :
//			System.out.println("비겼습니다.");
//			break;
//		default :
//			System.out.println("당신이 졌습니다.");
//			break;
//	}
		
	}
}
