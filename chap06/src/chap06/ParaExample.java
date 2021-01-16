package chap06;

public class ParaExample {
	public static void main(String[] args) {
		// 매개변수(parameter) : int a, int b
		// 인자(argument) : 
		double result = divide(10, 20);
		System.out.println(result);
		
//		System.arraycopy(src, srcPos, dest, destPos, len	gth)	; // 파라미터가 5개인 메소드
	}
	
	static double divide(int a, int b, int c) {
		return (double) a / b;
	}
	
	static double divide(int a, int b) {			// 파라미터 갯수가 다르면 다른 메소드로 인식 : 오버로딩
		return (double) a / b;
	}
	
	static double divide(double a, int b) {			// 파라미터의 타입도 다르면 다른 메소드로 인식 : 오버로딩
		return (double) a / b;
	}
}
