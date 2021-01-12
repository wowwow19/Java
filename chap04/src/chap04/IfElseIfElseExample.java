package chap04;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		String str = "";
		
		if (score >= 90) {
			str += "A";
		} else if (score >= 80) {
			str += "B";
		} else if (score >= 70) {
			str += "C";
		} else {
			str += "D";
		}
		
		System.out.println("등급은 " + str + "입니다.");
		
		// 프로그래밍에서 범위는 항상 이상 ~ 미만
		// 난수 생성
		Math.random(); // double 타입, 0 이상 1 미만의 수
		System.out.println(Math.random());
		
		// 경우의 수 : 6
		// Math.random() * 6
		// 0.0 ~ 5.999999...
		//             +1
		// --------------
		// 1.0 ~ 6.999999...
		
		System.out.println((int)(Math.random() * 6 + 1)); // 주사위 (1 ~ 6)
	}
}
