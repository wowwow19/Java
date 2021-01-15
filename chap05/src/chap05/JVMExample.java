package chap05;

public class JVMExample {
	int number; 				// 전역변수
	public static void main(String[] args) {
		int sum; 			  	// 기본형 지역변수
		String str = "도우너"; 	// 참조형 지역변수 : 주소가 저장 / 객체 : 참조자료형으로 만든 변수
		
		JVMExample ex1 = new JVMExample();
		JVMExample ex2 = new JVMExample();
		JVMExample ex3 = ex1;
		JVMExample ex4 = null;
	
		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);
		System.out.println(ex1 == ex2);		// false
		System.out.println(ex1 == ex3);		// true
		
		System.out.println(ex1 == null);	// false
		System.out.println(ex4 == null);	// true
		
		ex2 = null;							// 힙 영역 객체에 대한 참조를 끊음
		ex1 = null;
		
		System.out.println(str.length()); 	// 3
		
		str = null;
		
//		System.out.println(str.length());	// NullPointerException 오류
		
		String str1 = "둘리";					// 0x000
		String str2 = "둘리";					// 0x000 : 문자열이 같으면 같은 객체를 참조
		String str3 = new String("둘리");		// 0x001 -> 0x000 : 결국 같은 객체를 참조
		String str4 = "도우너";				// 0x002
		
		
	}
}
