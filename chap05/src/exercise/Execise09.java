package exercise;

import java.util.Scanner;

public class Execise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
				score = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("학생 " + (i+1) + "번의 점수 > ");
					score[i] = scanner.nextInt();
				}
				System.out.println("입력완료");
			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("학생 " + (i+1) + "번의 점수 : " + score[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				
				for (int i = 0; i < score.length; i++) {
					if (max < score[i]) {
						max = score[i];
					}
					sum += score[i];
				}
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double) sum / score.length);
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
