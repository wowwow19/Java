package chap08;

public class ExceptionExam {
	public static void main(String[] args) { // 클래스 메서드
		System.out.println("main()의 시작");
		method1();
		System.out.println("main()의 종료");
	}
	
	static void method1() {	// 클래스 메서드
		System.out.println("method1()의 시작");
		try {
			method2();			
		} catch (Exception e) {
			System.out.println("m1에서 예외처리");
		}
		System.out.println("method1()의 종료");
	}
	static void method2() throws Exception {	// 클래스 메서드
		System.out.println("method2()의 시작");
		method3();
		System.out.println("method2()의 종료");
	}
	static void method3() throws Exception {	// 클래스 메서드
		System.out.println("method3()의 시작");
//		try {
		throw new RuntimeException("런타임 예외 발생");	// 예외 발생
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("method3()의 종료");
	}
}
