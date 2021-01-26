package exercise_js;

public class Exercise8_10 {
	public static void main(String[] args) {
		try {
			method1();				// 1
			System.out.println(6);	// X
		} catch(Exception e) {
			System.out.println(7);	// 6
		}
	}
	
	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);	// X
		} catch(NullPointerException e) {
			System.out.println(2);	// 3
			throw e;				// 4
		} catch(Exception e) {
			System.out.println(3);	// X
		} finally {
			System.out.println(4);	// 5
		}
		System.out.println(5);		// X
	}
	
	static void method2() {
		throw new NullPointerException();	// 2
	}
}
