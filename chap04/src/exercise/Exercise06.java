package exercise;

public class Exercise06 {
	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) { 			// 좌하
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-----");
//		
//		for (int i = 4; i >= 0; i--) {			// 좌상
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-----");
//
//		for (int i = 0; i < 5; i++) {			// 우하
//			for (int j = 4 - i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-----");
//		
//		for (int i = 4; i >= 0; i--) {			// 우상
//			for (int j = 4 - i; j > 0; j--) {
//				System.out.print(" ");
//			} 
//			for (int k = 0; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		for (int i = 1; i <= 5; i++) {			// 마름모
			for (int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			for (int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
