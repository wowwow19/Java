package chap04;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
			
			int number = 10;
			
			System.out.println(number);
			System.out.println(score);
		}
		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
//		System.out.println(number); // 변수는 블록 내부에서만 유효
		
	}
}
