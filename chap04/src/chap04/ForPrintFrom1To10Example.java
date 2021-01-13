package chap04;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { 
			System.out.println(i);
		}
//		System.out.println(i);	   // 오류 : i는 반복문 안에서만 유효
		
		int i = 1;
		
		if (i <= 10) { 			   // 1 <= 10
			System.out.println(i); // 1
			i++; 				   // 1 >> 2
		}
		if (i <= 10) { 			   // 2 <= 10
			System.out.println(i); // 2
			i++; 				   // 2 >> 3
		}
		if (i <= 10) {			   // 3 <= 10
			System.out.println(i); // 3
			i++;				   // 3 >> 4		
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
		if (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
}
