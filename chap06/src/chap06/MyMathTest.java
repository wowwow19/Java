package chap06;

// 복수개의 클래스나 메서드가 있는 예제를 타이핑하는 법
// 1. 실행 클래스(메인 메서드를 포함하는)로 파일 이름을 작성
// 2. 메인메서드는 외부의 API를 실행하기때문에 외부 클래스, 메서드부터 작성

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);		// double타입으로 자동캐스팅
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + (int)(result4 * 100 + 0.5f) / 100f);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
}
