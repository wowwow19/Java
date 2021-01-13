package chap04;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {			
			System.out.println("--------------");
			System.out.println("컨티뉴 이전 : " + i);
			if (i % 2 == 0) {						// 짝수일 때 패스
				continue;
			}
			System.out.println("컨티뉴 이후 : " + i);
		}
	}
}
