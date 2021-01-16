package exercise_js;

import java.util.Scanner;

public class Exercise5_12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;	// 맞춘횟수를 담을 변수 선언
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.\n\n");
				count++;	// 맞추면 1 증가
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", words[i][1]);
			}
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, count);
	}
}
