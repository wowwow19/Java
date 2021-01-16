package exercise_js;

import java.util.Scanner;

public class Exercise5_13 {
	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for (int j = 0; j < question.length; j++) {
				char tmp = ' ';
				int num = (int)(Math.random() * question.length);	// question.length미만의 양의 정수 난수 생성
				
				tmp = question[j];				// 난수번째의 글자와 위치 바꾸기
				question[j] = question[num];
				question[num] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i+1, new String(question));
			String answer = scanner.nextLine();
			
			if (words[i].equals(answer.trim())) {
				System.out.println("맞았습니다.\n\n");
			} else {
				System.out.println("틀렸습니다.\n\n");
			}
		}
	}
}
