package chap04;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i++);
//			i++;
		}
		
		i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
