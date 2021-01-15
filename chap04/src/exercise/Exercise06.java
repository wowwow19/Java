package exercise;

public class Exercise06 {
	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j <= i)
//					System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i + j <= 4)
//					System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i + j >= 4) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j >= i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
				
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int tmpi = i-2;
//				int tmpj = j-2;
//				String a = tmpi < 0 ? tmpi+"" : " " + tmpi;
//				String b = tmpj < 0 ? tmpj+"" : " " + tmpj;
//				
//				if(tmpi * tmpj <= 1 && tmpi * tmpj >= -1) {
//					System.out.print("(" + a + ", " + b + ")");
//				} else {
//					System.out.print("        ");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int tmpi = i-2;					// 중심좌표를 (0, 0)로 맞춰주는 작업
				int tmpj = j-2;
				
				if(tmpi * tmpj <= 1 && tmpi * tmpj >= -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				int tmpi = i-3;					// 중심좌표를 (0, 0)로 맞춰주는 작업
				int tmpj = j-3;
				
				if(tmpi * tmpj <= 2 && tmpi * tmpj >= -2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


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
				
//		for (int i = 1; i <= 5; i++) {			// 마름모
//			for (int j = 5-i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= 2*i-1; k++) {
//				System.out.print("*");
//			}
//			for (int j = 5-i; j > 0; j--) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= 2*i-1; k++) {
//				System.out.print("*");
//			}
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

	}
}
