package chap04;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("****" + i + "단" + "****");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		for (int i = 0; i < 72; i++) {
			System.out.println((i / 9 + 2) + "*" + (i % 9 + 1) + "=" + (i / 9 + 2) * (i % 9 + 1));
		}
	}
}
