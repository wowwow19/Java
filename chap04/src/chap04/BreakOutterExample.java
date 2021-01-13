package chap04;

public class BreakOutterExample {
	public static void main(String[] args) {
		// 구구단 작성
		Outter : for (int i = 2; i<= 9; i++) {
					System.out.println("****" + i + "단****");
					for (int j = 1; j <= 9; j++) {
						if (i == 6) {
							break Outter;
						}
						System.out.println(i + " X " + j + " = " + i * j);
					}
				}
		System.out.println("구구단 종료");
	}
}
